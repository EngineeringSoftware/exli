package liquibase.ext.ora.merge;

import java.sql.Date;
import liquibase.database.Database;
import liquibase.database.core.OracleDatabase;
import liquibase.datatype.DataTypeFactory;
import liquibase.exception.ValidationErrors;
import liquibase.sql.Sql;
import liquibase.sql.UnparsedSql;
import liquibase.sqlgenerator.SqlGeneratorChain;
import liquibase.sqlgenerator.core.AbstractSqlGenerator;
import liquibase.statement.DatabaseFunction;
import liquibase.structure.core.Table;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class MergeGenerator extends AbstractSqlGenerator<MergeStatement> {

    public Sql[] generateSql(MergeStatement statement, Database database, SqlGeneratorChain sqlGeneratorChain) {
        String[] updateList = null;
        if (statement.getUpdateList() != null) {
            updateList = statement.getUpdateList().split(",");
            itest("randoop", 24).given(statement, "68.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "87.xml").checkEq(updateList, new String[] { "Transaction has been set" });
            itest("randoop", 24).given(statement, "27.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "144.xml").checkEq(updateList, new String[] { "Synonym revokeObjectPermission dropped" });
            itest("randoop", 24).given(statement, "136.xml").checkEq(updateList, new String[] { "Comment has been added to Materialized view grantObjectPermission has been droped" });
            itest("evosuite", 24).given(statement, "1.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "71.xml").checkEq(updateList, new String[] { "longUpdate" });
            itest("randoop", 24).given(statement, "123.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "81.xml").checkEq(updateList, new String[] { "constraint null DISABLED in null" });
            itest("randoop", 24).given(statement, "70.xml").checkEq(updateList, new String[] { "null check DROPPED from null" });
            itest("evosuite", 24).given(statement, "6.xml").checkEq(updateList, new String[] { "" });
            itest("evosuite", 24).given(statement, "3.xml").checkEq(updateList, new String[] { "PostgreSQL" });
            itest("randoop", 24).given(statement, "64.xml").checkEq(updateList, new String[] { "" });
            itest("evosuite", 24).given(statement, "0.xml").checkEq(updateList, new String[] { "&k(6.a1*!" });
            itest("evosuite", 24).given(statement, "7.xml").checkEq(updateList, new String[] {});
            itest("randoop", 24).given(statement, "158.xml").checkEq(updateList, new String[] { "Transaction has been set" });
            itest("evosuite", 24).given(statement, "2.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "98.xml").checkEq(updateList, new String[] { "REFERENCES" });
            itest("randoop", 24).given(statement, "160.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "138.xml").checkEq(updateList, new String[] { "http://www.liquibase.org/xml/ns/dbchangelog-ext" });
            itest("randoop", 24).given(statement, "102.xml").checkEq(updateList, new String[] { "http://www.liquibase.org/xml/ns/dbchangelog-ext" });
            itest("evosuite", 24).given(statement, "4.xml").checkEq(updateList, new String[] { "PostgreSQL" });
            itest("randoop", 24).given(statement, "133.xml").checkEq(updateList, new String[] { "Transaction has been set" });
            itest("randoop", 24).given(statement, "117.xml").checkEq(updateList, new String[] { "http://www.liquibase.org/xml/ns/dbchangelog-ext" });
            itest("randoop", 24).given(statement, "25.xml").checkEq(updateList, new String[] { "http://www.liquibase.org/xml/ns/dbchangelog-ext" });
            itest("randoop", 24).given(statement, "73.xml").checkEq(updateList, new String[] { "Constraint null ENABLED in null" });
            itest("randoop", 24).given(statement, "60.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "112.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "134.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "82.xml").checkEq(updateList, new String[] { "http://www.liquibase.org/xml/ns/dbchangelog-ext" });
            itest("randoop", 24).given(statement, "100.xml").checkEq(updateList, new String[] { "Transaction has been set" });
            itest("randoop", 24).given(statement, "47.xml").checkEq(updateList, new String[] { "Transaction has been set" });
            itest("randoop", 24).given(statement, "101.xml").checkEq(updateList, new String[] { "" });
            itest("evosuite", 24).given(statement, "5.xml").checkEq(updateList, new String[] { "PostgreSQL" });
            itest("randoop", 24).given(statement, "96.xml").checkEq(updateList, new String[] { "http://www.liquibase.org/xml/ns/dbchangelog-ext" });
            itest("randoop", 24).given(statement, "155.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "139.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "72.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "53.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "126.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "66.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "92.xml").checkEq(updateList, new String[] { "Triggernull has been droped" });
            itest("randoop", 24).given(statement, "46.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "74.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "54.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "57.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "125.xml").checkEq(updateList, new String[] { "Triggernull has been droped" });
            itest("randoop", 24).given(statement, "150.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "91.xml").checkEq(updateList, new String[] { "TriggerEXECUTE has been droped" });
            itest("randoop", 24).given(statement, "105.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "148.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "132.xml").checkEq(updateList, new String[] { "Transaction has been set" });
            itest("randoop", 24).given(statement, "65.xml").checkEq(updateList, new String[] { "" });
            itest("randoop", 24).given(statement, "56.xml").checkEq(updateList, new String[] { "createTrigger" });
            itest("randoop", 24).given(statement, "152.xml").checkEq(updateList, new String[] { "enableTrigger triggerName=Comment has been added to Materialized view grantObjectPermission has been droped" });
        }
        StringBuilder sql = new StringBuilder();
        sql.append("MERGE INTO ").append(database.escapeTableName(null, statement.getTargetSchemaName(), statement.getTargetTableName()));
        sql.append(" USING ").append(database.escapeTableName(null, statement.getSourceSchemaName(), statement.getSourceTableName()));
        sql.append(" ON (").append(statement.getOnCondition()).append(") ");
        if (updateList != null) {
            sql.append("WHEN MATCHED THEN UPDATE SET ");
            for (String list : updateList) {
                sql.append(list).append(",");
            }
            sql.deleteCharAt(sql.lastIndexOf(","));
            if (statement.getUpdateCondition() != null) {
                sql.append(" WHERE (").append(statement.getUpdateCondition()).append(")");
            }
            if (statement.getDeleteCondition() != null) {
                sql.append(" DELETE WHERE (").append(statement.getDeleteCondition()).append(")");
            }
        }
        if (statement.getColumnValues().size() > 0) {
            sql.append(" WHEN NOT MATCHED THEN INSERT (");
            for (String column : statement.getColumnValues().keySet()) {
                sql.append(column).append(",");
            }
            sql.deleteCharAt(sql.lastIndexOf(",")).append(") ");
            sql.append("VALUES (");
            for (String column : statement.getColumnValues().keySet()) {
                Object newValue = statement.getColumnValues().get(column);
                if (newValue == null || newValue.toString().equalsIgnoreCase("NULL")) {
                    sql.append("NULL");
                } else if (newValue instanceof String && !looksLikeFunctionCall(((String) newValue), database)) {
                    sql.append(DataTypeFactory.getInstance().fromObject(newValue, database).objectToSql(newValue, database));
                } else if (newValue instanceof Date) {
                    sql.append(database.getDateLiteral(((Date) newValue)));
                } else if (newValue instanceof Boolean) {
                    if (((Boolean) newValue)) {
                        sql.append(DataTypeFactory.getInstance().getTrueBooleanValue(database));
                    } else {
                        sql.append(DataTypeFactory.getInstance().getFalseBooleanValue(database));
                    }
                } else if (newValue instanceof DatabaseFunction) {
                    sql.append(database.generateDatabaseFunctionValue((DatabaseFunction) newValue));
                } else {
                    sql.append(newValue);
                }
                sql.append(",");
            }
            sql.deleteCharAt(sql.lastIndexOf(",")).append(") ");
            if (statement.getInsertCondition() != null) {
                sql.append("WHERE (").append(database.escapeObjectName(statement.getInsertCondition(), Table.class)).append(")");
            }
        }
        return new Sql[] { new UnparsedSql(sql.toString()) };
    }

    public boolean supports(MergeStatement statement, Database database) {
        return database instanceof OracleDatabase;
    }

    public ValidationErrors validate(MergeStatement statement, Database database, SqlGeneratorChain sqlGeneratorChain) {
        ValidationErrors valid = new ValidationErrors();
        valid.checkRequiredField("sourceTableName", statement.getSourceTableName());
        valid.checkRequiredField("targetTableName", statement.getTargetTableName());
        valid.checkRequiredField("onCondition", statement.getOnCondition());
        return valid;
    }
}
