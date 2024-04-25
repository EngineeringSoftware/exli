/*
 * Copyright (C) 2007-2020 Crafter Software Corporation. All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.core.service;

import org.craftercms.core.cache.CacheItem;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Set of options that should be used when caching in a service call. {@code expireAfter} and {@code refreshFrequency}
 * are expressed in ticks.
 *
 * @author Alfonso Vásquez
 */
public class CachingOptions {

    public static final CachingOptions DEFAULT_CACHING_OPTIONS = new CachingOptions();

    public static final CachingOptions CACHE_OFF_CACHING_OPTIONS = new CachingOptions(false, 0, 0);

    private boolean doCaching;

    private long expireAfter;

    private long refreshFrequency;

    public CachingOptions() {
        this.doCaching = true;
        this.expireAfter = CacheItem.NEVER_EXPIRE;
        this.refreshFrequency = CacheItem.NEVER_REFRESH;
    }

    public CachingOptions(boolean doCaching, long expireAfter, long refreshFrequency) {
        this.doCaching = doCaching;
        this.expireAfter = expireAfter;
        this.refreshFrequency = refreshFrequency;
    }

    public boolean doCaching() {
        return doCaching;
    }

    public void setDoCaching(boolean doCaching) {
        this.doCaching = doCaching;
    }

    public long getExpireAfter() {
        return expireAfter;
    }

    public void setExpireAfter(long expireAfter) {
        this.expireAfter = expireAfter;
    }

    public long getRefreshFrequency() {
        return refreshFrequency;
    }

    public void setRefreshFrequency(long refreshFrequency) {
        this.refreshFrequency = refreshFrequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CachingOptions options = (CachingOptions) o;
        if (doCaching != options.doCaching) {
            return false;
        }
        if (expireAfter != options.expireAfter) {
            return false;
        }
        if (refreshFrequency != options.refreshFrequency) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = (doCaching ? 1 : 0);
        result = 31 * result + (int) (expireAfter ^ (expireAfter >>> 32));
        itest("evosuite", 98).given(result, 1).given(expireAfter, 1L).checkEq(result, 32);
        itest("evosuite", 98).given(result, 0).given(expireAfter, 0L).checkEq(result, 0);
        itest("evosuite", 98).given(result, 1).given(expireAfter, 0L).checkEq(result, 31);
        itest("evosuite", 98).given(result, 1).given(expireAfter, -1084L).checkEq(result, 1114);
        itest("evosuite", 98).given(result, 0).given(expireAfter, -1L).checkEq(result, 0);
        itest("evosuite", 98).given(result, 1).given(expireAfter, -113L).checkEq(result, 143);
        itest("evosuite", 98).given(result, 0).given(expireAfter, -645L).checkEq(result, 644);
        itest("evosuite", 98).given(result, 1).given(expireAfter, -1L).checkEq(result, 31);
        result = 31 * result + (int) (refreshFrequency ^ (refreshFrequency >>> 32));
        itest("evosuite", 99).given(result, 644).given(refreshFrequency, -685L).checkEq(result, 20648);
        itest("evosuite", 99).given(result, 31).given(refreshFrequency, -1L).checkEq(result, 961);
        itest("evosuite", 99).given(result, 0).given(refreshFrequency, -3981L).checkEq(result, 3980);
        itest("evosuite", 99).given(result, 143).given(refreshFrequency, 0L).checkEq(result, 4433);
        itest("evosuite", 99).given(result, 31).given(refreshFrequency, 0L).checkEq(result, 961);
        itest("evosuite", 99).given(result, 0).given(refreshFrequency, 0L).checkEq(result, 0);
        itest("evosuite", 99).given(result, 1114).given(refreshFrequency, 1L).checkEq(result, 34535);
        itest("evosuite", 99).given(result, 31).given(refreshFrequency, -3043L).checkEq(result, 4003);
        itest("evosuite", 99).given(result, 32).given(refreshFrequency, -1144L).checkEq(result, 2135);
        return result;
    }
}
