package ro.sci.razvan.Mart22JDBCAssignment;

import jdk.nashorn.internal.scripts.JD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Razvan B
 * @date 31.03.2019
 * Display data for all classes.
 *
 * - Display data for a course with specified id.
 *
 * - Display data for all classes whose title (when converted to all lowercase letters) begins with "intro".
 *
 * - Display data for all classes whose dept (when converted to all lowercase letters)
 * is "cos" and whose coursenum begins with "3".
 */
public class Main {
    public static void main(String[] args) {

        JDBCUtil.selectAllRecordFromClasses();

        JDBCUtil.selectAllDateForIdCourse(1);

        JDBCUtil.selectAllRecordFromClassesWhereTitle("INTRO");

        JDBCUtil.selectAllRecordFromClassesWhereDept("COS");

    }
}
