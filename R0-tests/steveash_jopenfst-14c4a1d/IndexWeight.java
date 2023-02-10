/*
 * Copyright 2016 Steve Ash
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.steveash.jopenfst;

import org.inlinetest.Here;
import static org.inlinetest.Here.group;

/**
 * A tuple of an index (a state id, an arc id, whatever) + a weight (as a double)
 * This is immutable and is useful when you are storing these in collections
 * @author Steve Ash
 */
public class IndexWeight {

    private final int index;

    private final double weight;

    public IndexWeight(int index, double weight) {
        this.index = index;
        this.weight = weight;
    }

    public int getIndex() {
        return index;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IndexWeight that = (IndexWeight) o;
        if (index != that.index) {
            return false;
        }
        return Double.compare(that.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = index;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        new Here("Unit", 66).given(result, 0).given(temp, 0L).checkEq(result, 0);
        new Here("Unit", 66).given(result, 1).given(temp, 4617315517961601024L).checkEq(result, 1075052575);
        new Here("Unit", 66).given(result, 2).given(temp, 4617315517961601024L).checkEq(result, 1075052606);
        new Here("Unit", 66).given(result, 3).given(temp, 4623507967449235456L).checkEq(result, 1076494429);
        new Here("Unit", 66).given(result, 4).given(temp, 4621819117588971520L).checkEq(result, 1076101244);
        new Here("Unit", 66).given(result, 4).given(temp, 4625196817309499392L).checkEq(result, 1076887676);
        new Here("Unit", 66).given(result, 1).given(temp, 4619567317775286272L).checkEq(result, 1075576863);
        new Here("Unit", 66).given(result, 1).given(temp, 4622382067542392832L).checkEq(result, 1076232223);
        new Here("Unit", 66).given(result, 3).given(temp, 4622382067542392832L).checkEq(result, 1076232285);
        new Here("Unit", 66).given(result, 3).given(temp, 4621256167635550208L).checkEq(result, 1075970141);
        new Here("Unit", 66).given(result, 1).given(temp, 4623507967449235456L).checkEq(result, 1076494367);
        new Here("Unit", 66).given(result, 4).given(temp, 4622945017495814144L).checkEq(result, 1076363388);
        new Here("Unit", 66).given(result, 42).given(temp, 4644952842237378560L).checkEq(result, 1081488662);
        new Here("Unit", 66).given(result, 42).given(temp, 4617315517961601024L).checkEq(result, 1075053846);
        new Here("Unit", 66).given(result, 3).given(temp, 4624633867356078080L).checkEq(result, 1076756573);
        new Here("Unit", 66).given(result, 3).given(temp, 4619567317775286272L).checkEq(result, 1075576925);
        new Here("Unit", 66).given(result, 4).given(temp, 4624070917402656768L).checkEq(result, 1076625532);
        new Here("Unit", 66).given(result, 1).given(temp, 4621256167635550208L).checkEq(result, 1075970079);
        new Here("Unit", 66).given(result, 4).given(temp, 4625759767262920704L).checkEq(result, 1077018748);
        new Here("Unit", 66).given(result, 1).given(temp, 4613937818241073152L).checkEq(result, 1074266143);
        return result;
    }

    @Override
    public String toString() {
        return "IndexWeight{" + "index=" + index + ", weight=" + weight + '}';
    }
}
