package io.dataease.plugins.common.constants;

import io.dataease.plugins.common.util.ConstantsUtil;

import static io.dataease.plugins.common.constants.DatasourceTypes.mongo;

public class MongoConstants extends SQLConstants {
    public static final String KEYWORD_TABLE = "%s";

    public static final String KEYWORD_FIX = "%s." + mongo.getKeywordPrefix() + "%s" + mongo.getKeywordSuffix();

    public static final String ALIAS_FIX = mongo.getAliasPrefix() + "%s" + mongo.getAliasSuffix();

    public static final String toInt32 = "toInt32(%s)";

    public static final String toDateTime = "toDateTime(%s)";

    public static final String toInt64 = "toInt64(%s)";

    public static final String toFloat64 = "toFloat64(%s)";

    public static final String formatDateTime = "formatDateTime(%s,'%s')";

    public static final String toDecimal = "toDecimal64(%s,2)";

    public static final String DEFAULT_DATE_FORMAT = "%Y-%m-%d %H:%M:%S";

    public static final String WHERE_VALUE_NULL = "(NULL,'')";

    public static final String WHERE_VALUE_VALUE = "'%s'";

    public static final String AGG_COUNT = "COUNT(*)";

    public static final String AGG_FIELD = "%s(%s)";

    public static final String WHERE_BETWEEN = "'%s' AND '%s'";

    public static final String BRACKETS = "(%s)";

    public static final String NAME = "mongo";

    static {
        ConstantsUtil.add(MongoConstants.class);
    }
}
