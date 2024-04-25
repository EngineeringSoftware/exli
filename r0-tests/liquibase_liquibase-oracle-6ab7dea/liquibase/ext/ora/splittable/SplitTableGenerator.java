package liquibase.ext.ora.splittable;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import liquibase.change.ColumnConfig;
import liquibase.database.Database;
import liquibase.database.core.OracleDatabase;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.ValidationErrors;
import liquibase.exception.Warnings;
import liquibase.ext.ora.createtrigger.CreateTriggerGenerator;
import liquibase.ext.ora.createtrigger.CreateTriggerStatement;
import liquibase.ext.ora.droptrigger.DropTriggerGenerator;
import liquibase.ext.ora.droptrigger.DropTriggerStatement;
import liquibase.sql.Sql;
import liquibase.sql.UnparsedSql;
import liquibase.sqlgenerator.SqlGeneratorChain;
import liquibase.sqlgenerator.core.AbstractSqlGenerator;
import liquibase.sqlgenerator.core.AddColumnGenerator;
import liquibase.sqlgenerator.core.AddForeignKeyConstraintGenerator;
import liquibase.sqlgenerator.core.DropColumnGenerator;
import liquibase.statement.core.AddColumnStatement;
import liquibase.statement.core.AddForeignKeyConstraintStatement;
import liquibase.statement.core.DropColumnStatement;
import liquibase.structure.core.Table;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class SplitTableGenerator extends AbstractSqlGenerator<SplitTableStatement> {

    // XXX: that is wrong, Generator must be stateless
    private String[] columnList;

    boolean isTransition;

    private final List<UnparsedSql> sqlList = new ArrayList<UnparsedSql>();

    public Sql[] generateSql(SplitTableStatement statement, Database database, SqlGeneratorChain sqlGeneratorChain) {
        if (statement.getContext().equalsIgnoreCase("BASIC_CONTEXT")) {
            isTransition = false;
            Transition(statement, database, sqlGeneratorChain);
            Resulting(statement, database, sqlGeneratorChain);
        } else if (statement.getContext().equalsIgnoreCase("TRANSITION_CONTEXT")) {
            isTransition = true;
            Transition(statement, database, sqlGeneratorChain);
        } else if (statement.getContext().equalsIgnoreCase("RESULTING_CONTEXT")) {
            isTransition = true;
            Resulting(statement, database, sqlGeneratorChain);
        }
        Sql[] a = sqlList.toArray(new UnparsedSql[sqlList.size()]);
        return a;
    }

    public boolean generateStatementsIsVolatile(Database database) {
        return false;
    }

    public boolean generateRollbackStatementsIsVolatile(Database database) {
        return false;
    }

    public boolean supports(SplitTableStatement statement, Database database) {
        return (database instanceof OracleDatabase);
    }

    public ValidationErrors validate(SplitTableStatement statement, Database database, SqlGeneratorChain sqlGeneratorChain) {
        ValidationErrors validation = new ValidationErrors();
        validation.checkRequiredField("splitTableName", statement.getSplitTableName());
        validation.checkRequiredField("newTableName", statement.getNewTableName());
        validation.checkRequiredField("primaryKeyColumnName", statement.getPrimaryKeyColumnName());
        validation.checkRequiredField("columnNameList", statement.getColumnNameList());
        if (statement.getColumnNameList() != "") {
            columnList = statement.getColumnNameList().split(",");
            itest("evosuite", 80).given(statement, "15.xml").checkEq(columnList, new String[] { "ie3j5sy^h[b&e0ttp" });
            itest("randoop", 80).given(statement, "129.xml").checkEq(columnList, new String[] { "Triggernull has been droped" });
            itest("evosuite", 80).given(statement, "18.xml").checkEq(columnList, new String[] { ";6?fik@gDleBsyN" });
            itest("randoop", 80).given(statement, "146.xml").checkEq(columnList, new String[] { "http://www.liquibase.org/xml/ns/snapshot" });
            itest("randoop", 80).given(statement, "61.xml").checkEq(columnList, new String[] { "createMaterializedView" });
            itest("randoop", 80).given(statement, "39.xml").checkEq(columnList, new String[] { "http://www.liquibase.org/xml/ns/snapshot" });
            itest("randoop", 80).given(statement, "48.xml").checkEq(columnList, new String[] { "http://www.liquibase.org/xml/ns/snapshot" });
            itest("evosuite", 80).given(statement, "16.xml").checkEq(columnList, new String[] { "@8{I>Jom;U\"" });
            itest("randoop", 80).given(statement, "30.xml").checkEq(columnList, new String[] { "DisableTriggerChange{}" });
            itest("evosuite", 80).given(statement, "23.xml").checkEq(columnList, new String[] { "ie3j5sy^h[b&e0ttp" });
            itest("evosuite", 80).given(statement, "20.xml").checkEq(columnList, new String[] { "resulting_context" });
            itest("randoop", 80).given(statement, "109.xml").checkEq(columnList, new String[] { "Trigger has been renamed." });
            itest("randoop", 80).given(statement, "118.xml").checkEq(columnList, new String[] { "Comment has been added to Materialized view grantObjectPermission has been droped.Grants on null have been given to null check DROPPED from null" });
            itest("randoop", 80).given(statement, "97.xml").checkEq(columnList, new String[] { "Tables null & null merged" });
            itest("randoop", 80).given(statement, "145.xml").checkEq(columnList, new String[] { "Triggernull has been droped" });
            itest("randoop", 80).given(statement, "143.xml").checkEq(columnList, new String[] { "Constraint null ENABLED in null" });
            itest("randoop", 80).given(statement, "76.xml").checkEq(columnList, new String[] { "createTrigger" });
            itest("randoop", 80).given(statement, "124.xml").checkEq(columnList, new String[] { "Trigger has been renamed." });
            itest("randoop", 80).given(statement, "119.xml").checkEq(columnList, new String[] { "DropMaterializedViewChange{}" });
            itest("evosuite", 80).given(statement, "24.xml").checkEq(columnList, new String[] { "Nbi", "b.=Z]%\"SlN\"" });
            itest("evosuite", 80).given(statement, "22.xml").checkEq(columnList, new String[] { "a" });
            itest("randoop", 80).given(statement, "107.xml").checkEq(columnList, new String[] { "http://www.liquibase.org/xml/ns/snapshot" });
            itest("evosuite", 80).given(statement, "17.xml").checkEq(columnList, new String[] { "l", "e/b+co>#( ]" });
            itest("randoop", 80).given(statement, "89.xml").checkEq(columnList, new String[] { "DisableTriggerChange{}" });
            itest("randoop", 80).given(statement, "85.xml").checkEq(columnList, new String[] { "Grants on grantObjectPermission have been given to null" });
            itest("randoop", 80).given(statement, "88.xml").checkEq(columnList, new String[] { "CreateSynonymChange{}" });
            itest("randoop", 80).given(statement, "157.xml").checkEq(columnList, new String[] { "Table Revoking grants on null that had been given to TriggerGrants on http://www.liquibase.org/xml/ns/snapshot-ext have been given to null has been droped truncated" });
        } else {
            validation.addError("Incorect column list");
        }
        for (String name : columnList) {
            if (name.toUpperCase().equals(statement.getPrimaryKeyColumnName().toUpperCase())) {
                statement.setPrimaryKeyColumnName(statement.getPrimaryKeyColumnName() + "_ID");
                break;
            }
        }
        return validation;
    }

    private void Transition(SplitTableStatement statement, Database database, SqlGeneratorChain sqlGeneratorChain) {
        StringBuilder sb = new StringBuilder();
        AddForeignKeyConstraintGenerator FKGenerator = new AddForeignKeyConstraintGenerator();
        AddColumnGenerator ColGenerator = new AddColumnGenerator();
        CreateTriggerGenerator trigger = new CreateTriggerGenerator();
        Statement stat;
        ResultSet result;
        try {
            Connection connection = ((JdbcConnection) database.getConnection()).getWrappedConnection();
            stat = connection.createStatement();
            sb.append("CREATE TABLE " + database.escapeObjectName(statement.getNewTableName(), Table.class) + "(");
            sb.append(statement.getPrimaryKeyColumnName() + " INTEGER,");
            for (String name : columnList) {
                result = stat.executeQuery("SELECT DATA_TYPE,DATA_LENGTH,DATA_PRECISION, DATA_SCALE FROM USER_TAB_COLS where (COLUMN_NAME='" + name.toUpperCase() + "'and TABLE_NAME='" + statement.getSplitTableName() + "')");
                result.next();
                sb.append(name + " " + result.getString(1));
                if (result.getString(2) != null && result.getString(3) == null) {
                    sb.append("(" + result.getString(2) + ")");
                } else if (result.getString(3) != null) {
                    sb.append("(" + result.getString(3));
                    if (result.getString(4) != null) {
                        sb.append("," + result.getString(4));
                    }
                    sb.append(")");
                } else if (result.getString(4) != null) {
                    sb.append("(" + result.getString(4) + ")");
                }
                sb.append(",");
            }
            sb.append("CONSTRAINT " + statement.getPrimaryKeyColumnName() + "_PK PRIMARY KEY(" + statement.getPrimaryKeyColumnName() + "))");
        } catch (SQLException e) {
            System.out.println("wystapil blad: " + e.getMessage());
        }
        sqlList.add(new UnparsedSql(sb.toString()));
        // ADD COLUMN INTO NEW TABLE
        AddColumnStatement acs = new AddColumnStatement(null, statement.getSplitTableSchemaName(), statement.getSplitTableName(), statement.getPrimaryKeyColumnName(), "INTEGER", null);
        sqlList.add(new UnparsedSql(ColGenerator.generateSql(acs, database, sqlGeneratorChain)[0].toSql()));
        // CREATE NEW SEQUENCE
        sqlList.add(new UnparsedSql("CREATE SEQUENCE " + statement.getPrimaryKeyColumnName() + "_seq MINVALUE 1 " + "START WITH 1 " + "INCREMENT BY 1 " + "CACHE 20"));
        // TRIGGER - AUTOINCREMENT
        CreateTriggerStatement cts = new CreateTriggerStatement(statement.getNewTableSchemaName(), "sequence_trigger_" + statement.getNewTableName(), "before");
        cts.setReplace(true);
        cts.setTableName(statement.getNewTableName());
        cts.setForEachRow(true);
        cts.setInsert(true);
        StringBuilder procedure = new StringBuilder();
        procedure.append("BEGIN SELECT " + statement.getPrimaryKeyColumnName() + "_seq.nextval into :new." + statement.getPrimaryKeyColumnName());
        procedure.append(" from dual;end;");
        cts.setProcedure(procedure.toString());
        sqlList.add(new UnparsedSql(trigger.generateSql(cts, database, sqlGeneratorChain)[0].toSql()));
        // COPY DATA INTO NEW TABLE
        sqlList.add(new UnparsedSql("INSERT INTO " + statement.getNewTableName() + "(" + statement.getColumnNameList() + ")" + "select distinct " + statement.getColumnNameList() + " from " + statement.getSplitTableName()));
        // UPDATE SPLIT TABLE WITH NEW ID
        sb = new StringBuilder();
        sb.append("UPDATE " + statement.getSplitTableName() + " SET " + statement.getPrimaryKeyColumnName() + "=(SELECT ");
        sb.append(statement.getPrimaryKeyColumnName() + " FROM " + statement.getNewTableName() + " WHERE ");
        for (int i = 0; i < columnList.length; i++) {
            sb.append(statement.getNewTableName() + "." + columnList[i] + "=" + statement.getSplitTableName() + "." + columnList[i]);
            if (i < columnList.length - 1) {
                sb.append(" and ");
            }
        }
        sb.append(")");
        sqlList.add(new UnparsedSql(sb.toString()));
        // CREATE FOREIGN KEY (SPLIT TABLE)
        sqlList.add(new UnparsedSql(FKGenerator.generateSql(new AddForeignKeyConstraintStatement(statement.getPrimaryKeyColumnName() + "_FK", null, statement.getSplitTableSchemaName(), statement.getSplitTableName(), new ColumnConfig[] { new ColumnConfig().setName(statement.getPrimaryKeyColumnName()) }, null, statement.getNewTableSchemaName(), statement.getNewTableName(), new ColumnConfig[] { new ColumnConfig().setName(statement.getPrimaryKeyColumnName()) }), database, sqlGeneratorChain)[0].toSql()));
        if (isTransition) {
            // TRIGGER BEFORE INSERT
            cts = new CreateTriggerStatement(statement.getSplitTableSchemaName(), "before_insert_" + statement.getSplitTableName(), "before");
            cts.setInsert(true);
            cts.setReplace(true);
            cts.setForEachRow(true);
            cts.setTableName(statement.getSplitTableName());
            procedure = new StringBuilder();
            procedure.append("\n DECLARE \n dat integer; \n BEGIN \n IF :NEW." + statement.getPrimaryKeyColumnName() + " IS NOT NULL THEN \n ");
            procedure.append("SELECT " + statement.getColumnNameList() + " INTO ");
            for (String s : columnList) {
                procedure.append(":NEW." + s + ",");
            }
            procedure.deleteCharAt(procedure.lastIndexOf(","));
            procedure.append(" FROM " + statement.getNewTableName() + " WHERE :NEW." + statement.getPrimaryKeyColumnName() + "=" + statement.getNewTableName() + "." + statement.getPrimaryKeyColumnName() + "; \n ");
            procedure.append("ELSE \n SELECT " + statement.getPrimaryKeyColumnName() + " INTO dat FROM " + statement.getNewTableName() + " WHERE ");
            for (int i = 0; i < columnList.length; i++) {
                procedure.append(":NEW." + columnList[i] + "=" + statement.getNewTableName() + "." + columnList[i]);
                if (i < columnList.length - 1) {
                    procedure.append(" and ");
                }
            }
            procedure.append("; \n ");
            procedure.append(":NEW." + statement.getPrimaryKeyColumnName() + " := dat; \n END IF; \n EXCEPTION \n WHEN NO_DATA_FOUND THEN INSERT INTO ");
            procedure.append(statement.getNewTableName() + "(" + statement.getColumnNameList() + ") VALUES (");
            for (String s : columnList) {
                procedure.append(":NEW." + s + ",");
            }
            procedure.deleteCharAt(procedure.lastIndexOf(","));
            procedure.append("); \n SELECT MAX(" + statement.getPrimaryKeyColumnName() + ") INTO :NEW." + statement.getPrimaryKeyColumnName() + " FROM " + statement.getNewTableName() + "; \n ");
            procedure.append("END;");
            cts.setProcedure(procedure.toString());
            sqlList.add(new UnparsedSql(trigger.generateSql(cts, database, sqlGeneratorChain)[0].toSql()));
            // TRIGGER BEFORE UPDATE
            cts = new CreateTriggerStatement(statement.getSplitTableSchemaName(), "before_update_" + statement.getSplitTableName(), "before");
            cts.setUpdateOf(true);
            cts.setColumnNames(statement.getColumnNameList());
            cts.setReplace(true);
            cts.setForEachRow(true);
            cts.setTableName(statement.getSplitTableName());
            procedure = new StringBuilder();
            procedure.append("\n DECLARE \n dat integer; \n BEGIN \n ");
            procedure.append("SELECT " + statement.getPrimaryKeyColumnName() + " INTO dat FROM " + statement.getNewTableName() + " WHERE ");
            for (int i = 0; i < columnList.length; i++) {
                procedure.append(":NEW." + columnList[i] + "=" + statement.getNewTableName() + "." + columnList[i]);
                if (i < columnList.length - 1) {
                    procedure.append(" and ");
                }
            }
            procedure.append("; \n :NEW." + statement.getPrimaryKeyColumnName() + ":=dat; \n ");
            procedure.append("EXCEPTION \n WHEN NO_DATA_FOUND THEN INSERT INTO " + statement.getNewTableName() + "(" + statement.getColumnNameList() + ") VALUES (");
            for (String s : columnList) {
                procedure.append(":NEW." + s + ",");
            }
            procedure.deleteCharAt(procedure.lastIndexOf(",")).append("); \n ");
            procedure.append("SELECT MAX(" + statement.getPrimaryKeyColumnName() + ") INTO :NEW." + statement.getPrimaryKeyColumnName() + " FROM " + statement.getNewTableName() + "; \n END;");
            cts.setProcedure(procedure.toString());
            sqlList.add(new UnparsedSql(trigger.generateSql(cts, database, sqlGeneratorChain)[0].toSql()));
        }
    }

    private void Resulting(SplitTableStatement statement, Database database, SqlGeneratorChain sqlGeneratorChain) {
        DropTriggerGenerator dto = new DropTriggerGenerator();
        DropTriggerStatement dts = new DropTriggerStatement(statement.getNewTableSchemaName(), "sequence_trigger_" + statement.getNewTableName());
        sqlList.add(new UnparsedSql(dto.generateSql(dts, database, sqlGeneratorChain)[0].toSql()));
        if (isTransition) {
            dts = new DropTriggerStatement(statement.getSplitTableSchemaName(), "before_insert_" + statement.getSplitTableName());
            sqlList.add(new UnparsedSql(dto.generateSql(dts, database, sqlGeneratorChain)[0].toSql()));
            dts = new DropTriggerStatement(statement.getSplitTableSchemaName(), "before_update_" + statement.getSplitTableName());
            sqlList.add(new UnparsedSql(dto.generateSql(dts, database, sqlGeneratorChain)[0].toSql()));
        }
        sqlList.add(new UnparsedSql("DROP SEQUENCE " + statement.getPrimaryKeyColumnName() + "_seq"));
        DropColumnGenerator dcg = new DropColumnGenerator();
        DropColumnStatement dcs;
        for (String name : columnList) {
            dcs = new DropColumnStatement(null, statement.getSplitTableSchemaName(), statement.getSplitTableName(), name);
            sqlList.add(new UnparsedSql(dcg.generateSql(dcs, database, sqlGeneratorChain)[0].toSql()));
        }
    }

    public boolean requiresUpdatedDatabaseMetadata(Database database) {
        return false;
    }

    public Warnings warn(SplitTableStatement statementType, Database database, SqlGeneratorChain sqlGeneratorChain) {
        return sqlGeneratorChain.warn(statementType, database);
    }
}