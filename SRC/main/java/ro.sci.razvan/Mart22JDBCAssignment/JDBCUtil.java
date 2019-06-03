package ro.sci.razvan.Mart22JDBCAssignment;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.sql.*;

/**
 * @Razvan B
 * @date 31.03.2019
 * we have method that select and insert values for all tables in the schema school
 * also have:
 * 1. selectAllRecordFromClasses()
 * 2. selectAllDateForIdCourse(int id)
 * 3. selectAllRecordFromClassesWhereTitle(String getValue)
 * 4. selectAllRecordFromClassesWhereDept(String getValue)
 */
public class JDBCUtil {
    public static Connection main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }
        return null;
    }

    public static Connection getConnection() {
        Connection connection = null;
        DriverManager.setLoginTimeout(60);  // wait 1 min; optional: DB may be busy, good to set a higher timeout
        try {
            String url = new StringBuilder()
                    .append("jdbc:")
                    .append("mysql")       // “mysql” / “db2” / “mssql” / “oracle” / ...
                    .append("://")
                    .append("localhost")
                    .append(":")
                    .append(3306)
                    .append("/")
                    .append("school")
                    .append("?user=")
                    .append("root")
                    .append("&password=")
                    .append("12345678").toString();
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println("Cannot connect to the database: " + e.getMessage());
        }
        return connection;
    }

    public static void insertValuesIntoProfs(String profName1) {
        Connection conn = getConnection();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("insert into profs( profname) values (?)");
            ps.setString(1, profName1);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Cannot insert Profs: " + e.getMessage());
        } finally {
            if (ps != null) try {
                ps.close();
            } catch (SQLException e) {
            }
        }
    }

    public static void selectAllRecordFromProfs() {
        Connection connection = JDBCUtil.getConnection();
        if (connection == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s%20s\n";
        try {
            st = connection.createStatement();
            rs = st.executeQuery("select * from profs");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "profid", "profname");
                do {
                    System.out.format(format, rs.getString("profid"), rs.getString("profname"));
                } while (rs.next());
            } else {
                System.out.println("No results");
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (SQLException e) {
            }
            if (st != null) try {
                st.close();
            } catch (SQLException e) {
            }
            try {
                connection.close();
            } catch (SQLException e) {
            }
        }
    }

    public static void insertValuesIntoCourse(String area, String title, String descrip, String prereqs) {
        Connection conn = getConnection();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("insert into courses( area, title, descrip, prereqs ) values (?,?,?,?)");
            ps.setString(1, area);
            ps.setString(2, title);
            ps.setString(3, descrip);
            ps.setString(4, prereqs);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Cannot insert Courses: " + e.getMessage());
        } finally {
            if (ps != null) try {
                ps.close();
            } catch (SQLException e) {
            }
        }
    }

    public static void selectAllRecordFromCourses() {
        Connection connection = JDBCUtil.getConnection();
        if (connection == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s%20s%20s%20s\n";
        try {
            st = connection.createStatement();
            rs = st.executeQuery("select * from courses");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "area", "title", "descrip", "prereqs");
                do {
                    System.out.format(format, rs.getString("area"), rs.getString("title"),
                            rs.getString("descrip"), rs.getString("prereqs"));
                } while (rs.next());
            } else {
                System.out.println("No results");
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (SQLException e) {
            }
            if (st != null) try {
                st.close();
            } catch (SQLException e) {
            }
            try {
                connection.close();
            } catch (SQLException e) {
            }
        }
    }

    public static void insertValuesIntoCoursesProfs(int courseid, int profid) {
        Connection conn = getConnection();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("insert into coursesprofs(courseid, profid) values (?,?)");
            ps.setInt(1, courseid);
            ps.setInt(2, profid);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Cannot insert into courseProfs table" + e.getMessage());

        } finally {
            if (ps != null) try {
                ps.close();
            } catch (SQLException e) {
            }
        }
    }

    public static void selectAllRecordFromCourseProf() {
        Connection conn = JDBCUtil.getConnection();
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s%20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from coursesprofs");
            boolean hasResult = rs.next();
            if (hasResult) {
                System.out.format(format, "courseid", "profid");
                do {
                    System.out.format(format, rs.getInt("courseid"), rs.getInt("profid"));
                } while (rs.next());
            }
            else {
                System.out.println("No results");
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (SQLException e) {
            }
            if (st != null) try {
                st.close();
            } catch (SQLException e) {
            }
            try {
                conn.close();
            } catch (SQLException e) {
            }
        }
    }

    public static void insertValuesIntoClasses(int courseid, String days,String startTime, String endTime,
                                               String bldg, String roomnum) {
        Connection conn = getConnection();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("insert into classes(courseid,days,starttime,endtime,bldg,roomnum)"+
                    "values (?,?,?,?,?,?)");
            ps.setInt(1, courseid);
            ps.setString(2,days);
            ps.setString(3,startTime);
            ps.setString(4,endTime);
            ps.setString(5, bldg);
            ps.setString(6,roomnum);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Cannot insert into classes" + e.getMessage());

        } finally {
            if (ps != null) try {
                ps.close();
            } catch (SQLException e) {
            }
        }
    }

    public static void selectAllRecordFromClasses() {
        Connection conn = JDBCUtil.getConnection();
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s%20s%20s%20s%20s%20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from classes");
            boolean hasResult = rs.next();
            if (hasResult) {
                System.out.format(format, "courseid","days","starttime","endtime","bldg","roomnum");
                do {
                    System.out.format(format,  rs.getInt("courseid"),
                            rs.getString("days"),rs.getString("starttime"),
                            rs.getString("endtime"),rs.getString("bldg"),
                            rs.getString("roomnum"));
                } while (rs.next());
            }
            else {
                System.out.println("No results");
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (SQLException e) {
            }
            if (st != null) try {
                st.close();
            } catch (SQLException e) {
            }
            try {
                conn.close();
            } catch (SQLException e) {
            }
        }
    }


    public static void insertValuesIntoCrossListings(int courseid, String dept, int coursenum) {
        Connection conn = getConnection();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("insert into crosslistings(courseid, dept, coursenum) values (?,?,?)");

            ps.setInt(1, courseid);
            ps.setString(2, dept);
            ps.setInt(3, coursenum);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Cannot insert into CrossListings table" + e.getMessage());

        } finally {
            if (ps != null) try {
                ps.close();
            } catch (SQLException e) {
            }
        }
    }

    public static void selectAllRecordFromCrossListings() {
        Connection conn = JDBCUtil.getConnection();
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s%20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from crosslistings");
            boolean hasResult = rs.next();
            if (hasResult) {
                System.out.format(format, "dept", "coursenum");
                do {
                    System.out.format(format, rs.getString("dept"), rs.getInt("coursenum"));
                } while (rs.next());
            }
            else {
                System.out.println("No results");
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (SQLException e) {
            }
            if (st != null) try {
                st.close();
            } catch (SQLException e) {
            }
            try {
                conn.close();
            } catch (SQLException e) {
            }
        }
    }

    public static void selectAllDateForIdCourse(int id) {
        Connection conn = JDBCUtil.getConnection();
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s%20s%20s%30s%20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from courses where courseid =" + id);

            boolean hasResult = rs.next();
            if (hasResult) {
                System.out.format(format, "courseid","area", "title","descrip", "prereqs");
                do {
                    System.out.format(format,rs.getInt("courseid"), rs.getString("area"), rs.getString("title"),
                            rs.getString("descrip"), rs.getString("prereqs"));
                } while (rs.next());
            }
            else {
                System.out.println("No results");
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (SQLException e) {
            }
            if (st != null) try {
                st.close();
            } catch (SQLException e) {
            }
            try {
                conn.close();
            } catch (SQLException e) {
            }
        }
    }

    public static void selectAllRecordFromAllTable() {
        Connection conn = JDBCUtil.getConnection();
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s%20s%20s%20s%20s%30s%20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT  courses.courseid,profs.profid,profname,title, area,  descrip,prereqs FROM courses INNER JOIN coursesprofs ON " +
                    "(courses.courseid = coursesprofs.courseid) INNER JOIN profs ON " +
                    "(coursesprofs.profid = profs.profid)");
            boolean hasResult = rs.next();
            if (hasResult) {
                System.out.format(format, "courseid","profid","profname", "title", "area", "descrip", "prereqs");
                do {
                    System.out.format(format, rs.getInt("courseid"), rs.getInt("profid"),
                            rs.getString("profname"),rs.getString("title"),rs.getString("area"),
                            rs.getString("descrip"),rs.getString("prereqs"));
                } while (rs.next());
            }
            else {
                System.out.println("No results");
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (SQLException e) {
            }
            if (st != null) try {
                st.close();
            } catch (SQLException e) {
            }
            try {
                conn.close();
            } catch (SQLException e) {
            }
        }
    }

    public static void selectAllRecordFromClassesWhereTitle(String getValue) {
        Connection connection = JDBCUtil.getConnection();
        if (connection == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s%20s%20s%20s%20s%20s\n";
        try {
            st = connection.createStatement();
            rs = st.executeQuery("SELECT lower(title) as title,courses.courseid,days,starttime,endtime,bldg,roomnum" +
                    "  FROM courses INNER JOIN classes ON courses.courseid=classes.courseid WHERE title LIKE \"" +getValue+"%\"");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "title","courseid","days","starttime","endtime","bldg","roomnum");
                do {
                    System.out.format(format,rs.getString("title"),
                            rs.getInt("courseid"), rs.getString("days"),
                            rs.getString("starttime"), rs.getString("endtime"),
                            rs.getString("bldg"), rs.getString("roomnum"));
                } while (rs.next());
            } else {
                System.out.println("No results");
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (SQLException e) {
            }
            if (st != null) try {
                st.close();
            } catch (SQLException e) {
            }
            try {
                connection.close();
            } catch (SQLException e) {
            }
        }
    }

    public static void selectAllRecordFromClassesWhereDept(String getValue) {
        Connection connection = JDBCUtil.getConnection();
        if (connection == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s%20s%20s%20s%20s%20s\n";
        try {
            st = connection.createStatement();
            rs = st.executeQuery("SELECT lower(dept) as dept,classes.courseid,days,starttime,endtime,bldg,roomnum" +
                    "  FROM classes INNER JOIN crosslistings ON classes.courseid = crosslistings.courseid WHERE dept LIKE \"" +getValue+"\"");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "dept","courseid","days","starttime","endtime","bldg","roomnum");
                do {
                    System.out.format(format,rs.getString("dept"),
                            rs.getInt("courseid"), rs.getString("days"),
                            rs.getString("starttime"), rs.getString("endtime"),
                            rs.getString("bldg"), rs.getString("roomnum"));
                } while (rs.next());
            } else {
                System.out.println("No results");
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (SQLException e) {
            }
            if (st != null) try {
                st.close();
            } catch (SQLException e) {
            }
            try {
                connection.close();
            } catch (SQLException e) {
            }
        }
    }

    public static void updateValuesIntoCrossListings( String dept, int courseid, int getCourseNum) {
        Connection conn = getConnection();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("update crosslistings set dept = ? where courseid = ? AND coursenum = ?");
            ps.setString(1, dept);
            ps.setInt(2, courseid);
            ps.setInt(3,getCourseNum);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Cannot insert into CrossListings table" + e.getMessage());

        } finally {
            if (ps != null) try {
                ps.close();
            } catch (SQLException e) {
            }
        }
    }

}

