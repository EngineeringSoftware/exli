package liquibase.ext.ora.comment;

import liquibase.database.Database;
import liquibase.database.core.OracleDatabase;
import liquibase.exception.ValidationErrors;
import liquibase.sql.Sql;
import liquibase.sql.UnparsedSql;
import liquibase.sqlgenerator.SqlGeneratorChain;
import liquibase.sqlgenerator.core.AbstractSqlGenerator;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class CommentOnGenerator extends AbstractSqlGenerator<CommentOnStatement> {

    public Sql[] generateSql(CommentOnStatement statement, Database database, SqlGeneratorChain sqlGeneratorChain) {
        String comment = database.escapeStringForDatabase(statement.getComment());
        String tableName = database.escapeTableName(null, statement.getSchemaName(), statement.getTableName());
        String columnName = database.escapeColumnName(null, statement.getSchemaName(), statement.getTableName(), statement.getColumnName());
        String sql = statement.isColumnComment() ? String.format("COMMENT ON COLUMN %s.%s IS '%s'", tableName, columnName, comment) : String.format("COMMENT ON TABLE %s IS '%s'", tableName, comment);
        itest("evosuite", 21).given(statement, "10.xml").given(comment, "").given(tableName, "\"RsWZq/;U\"").given(columnName, "\":_Tt=IDHM7`_^qI\"").checkEq(sql, "COMMENT ON COLUMN \"RsWZq/;U\".\":_Tt=IDHM7`_^qI\" IS ''");
        itest("evosuite", 21).given(statement, "8.xml").given(comment, "mK*''<i||f>2Z#$W").given(tableName, "\"mK*'<i||f>2Z#$W\".\"mK*'<i||f>2Z#$W\"").given(columnName, "\"mK*'<i||f>2Z#$W\"").checkEq(sql, "COMMENT ON COLUMN \"mK*'<i||f>2Z#$W\".\"mK*'<i||f>2Z#$W\".\"mK*'<i||f>2Z#$W\" IS 'mK*''<i||f>2Z#$W'");
        itest("evosuite", 21).given(statement, "14.xml").given(comment, null).given(tableName, null).given(columnName, null).checkEq(sql, "COMMENT ON TABLE null IS 'null'");
        itest("evosuite", 21).given(statement, "12.xml").given(comment, "INGRES").given(tableName, "\"\"").given(columnName, "\"S<~M:8!+kW\"").checkEq(sql, "COMMENT ON COLUMN \"\".\"S<~M:8!+kW\" IS 'INGRES'");
        itest("evosuite", 21).given(statement, "13.xml").given(comment, "").given(tableName, null).given(columnName, null).checkEq(sql, "COMMENT ON TABLE null IS ''");
        itest("evosuite", 21).given(statement, "10.xml").given(comment, "").given(tableName, "\":_Tt=IDHM7`_^qI\".\"RsWZq/;U\"").given(columnName, "\":_Tt=IDHM7`_^qI\"").checkEq(sql, "COMMENT ON COLUMN \":_Tt=IDHM7`_^qI\".\"RsWZq/;U\".\":_Tt=IDHM7`_^qI\" IS ''");
        itest("evosuite", 21).given(statement, "9.xml").given(comment, "").given(tableName, "").given(columnName, "").checkEq(sql, "COMMENT ON COLUMN . IS ''");
        itest("evosuite", 21).given(statement, "11.xml").given(comment, null).given(tableName, "").given(columnName, null).checkEq(sql, "COMMENT ON TABLE  IS 'null'");
        return new Sql[] { new UnparsedSql(sql) };
    }

    public boolean supports(CommentOnStatement statement, Database database) {
        return database instanceof OracleDatabase;
    }

    public ValidationErrors validate(CommentOnStatement statement, Database database, SqlGeneratorChain sqlGeneratorChain) {
        ValidationErrors validationErrors = new ValidationErrors();
        validationErrors.checkRequiredField("tableName", statement.getTableName());
        validationErrors.checkRequiredField("comment", statement.getComment());
        return validationErrors;
    }
}
