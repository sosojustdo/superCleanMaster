package cn.studyjams.s2.sj0208.supercleanmaster.ui;

import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

import cn.studyjams.s2.sj0208.supercleanmaster.R;
import cn.studyjams.s2.sj0208.supercleanmaster.base.BaseSwipeBackActivity;
import cn.studyjams.s2.sj0208.supercleanmaster.utils.AppUtil;

import butterknife.InjectView;

public class AboutActivity extends BaseSwipeBackActivity {

    @InjectView(R.id.subVersion)
    TextView subVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setTitle("关于");
        TextView tv = (TextView) findViewById(R.id.app_information);
        Linkify.addLinks(tv, Linkify.ALL);

        subVersion.setText("V"+ AppUtil.getVersion(mContext));

    }

}
