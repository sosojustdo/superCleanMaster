package cn.studyjams.s2.sj0208.supercleanmaster.widget.textcounter.formatters;


import cn.studyjams.s2.sj0208.supercleanmaster.widget.textcounter.Formatter;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by prem on 10/28/14.
 */
public class IntegerFormatter implements Formatter {

    @Override
    public String format(String prefix, String suffix, float value) {
        return prefix + NumberFormat.getNumberInstance(Locale.US).format(value) + suffix;
    }
}
