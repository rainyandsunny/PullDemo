package com.yuntu.demo.pulldemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;

/**
 * Created by yanghaipeng on 2017/8/9.
 */

public class MyListView extends ListView implements AbsListView.OnScrollListener{

    //------------------------普通成员变量------------------------

    private View mHeaderView;
    private View mFootView;
    private View mCenterView;
    private Context mContext;
    private int mHeaderViewHeight;
    private int mFooterViewHeight;

    private float mFirstClickPosition;
    private float mCurr

    //------------------------静态成员变量---------------------------

    private static final String TAG = "MyListView";

    //------------------------构造方法区------------------------------

    public MyListView(Context context) {
        super(context);
        mContext = context;
    }

    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
    }

    //------------------------静态方法区------------------------------




    //-------------------------实现父类/接口方法区----------------------




    //-----------------------------普通方法区--------------------------

    private void initHeaderView(){

        mHeaderView = LayoutInflater.from(mContext).inflate(R.layout.header,null);
        addHeaderView(mHeaderView);
    }

    private void initCenterView(){

        mCenterView = LayoutInflater.from(mContext).inflate(R.layout.center,null);

    }

    private void initFootView(){
        mFootView = LayoutInflater.from(mContext).inflate(R.layout.footer,null);
        mFootView.measure(0,0);
        mFooterViewHeight = mFootView.getMeasuredHeight();
        mFootView.setPadding(0,-mFooterViewHeight,0,0);
        addFooterView(mFootView);
    }


    //-------------------------------内部类-----------------------------




    //------------------------------接口区-------------------------------

    @Override
    public void onScrollStateChanged(AbsListView absListView, int i) {

    }

    @Override
    public void onScroll(AbsListView absListView, int i, int i1, int i2) {


    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {

        int action = ev.getAction();
        switch (action){

            case MotionEvent.ACTION_DOWN:{

                mFirstClickPosition = ev.getY();

            }break;
            case MotionEvent.ACTION_MOVE:{


            }break;
            case MotionEvent.ACTION_UP:{

            }break;
        }
        return super.onTouchEvent(ev);
    }
}
