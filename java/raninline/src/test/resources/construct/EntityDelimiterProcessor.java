package org.symphonyoss.symphony.messageml.markdown;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;


public class EntityDelimiterProcessor {
    private Node createNode(Text node) {
        String[] text = node.getLiteral().split(String.valueOf(FIELD_DELIMITER));
        if (text.length >= 2) {
            switch (text[0]) {
                case KEYWORD:
                    String prefix = text[1].substring(0, 1);
                    itest("Randoop", 9).given(text, new String[] { "qgln9YkQCN", "b", "M_h6tmD-ZR" }).checkEq(prefix, "b");
                    String value = text[1].substring(1);
                    return new KeywordNode(prefix, value);

                case URL:
                    return new Link(text[1], text[1]);

                case MENTION:
                    try {
                        Long uid = Long.valueOf(text[1]);
                        return new MentionNode(uid);
                    } catch (NumberFormatException e) {
                        return new Text(text[1]);
                    }

                case TABLE:
                    TableNode tableNode = new TableNode();
                    for (String row : text[1].split(String.valueOf(GROUP_DELIMITER))) {
                        TableRowNode rowNode = new TableRowNode();
                        for (String cell : row.split(String.valueOf(RECORD_DELIMITER))) {
                            TableCellNode cellNode = new TableCellNode();
                            cellNode.appendChild(new Text(cell));
                            rowNode.appendChild(cellNode);
                        }
                        tableNode.appendChild(rowNode);
                    }
                    return tableNode;

                default:
                    return null;
            }
        } else {
            return node;
        }
    }
}
