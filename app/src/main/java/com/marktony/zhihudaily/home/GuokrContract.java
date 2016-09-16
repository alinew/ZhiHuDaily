package com.marktony.zhihudaily.home;

import com.marktony.zhihudaily.bean.GuokrHandpickPost;
import com.marktony.zhihudaily.interfaces.BasePresenter;
import com.marktony.zhihudaily.interfaces.BaseView;

import java.util.ArrayList;

/**
 * Created by Lizhaotailang on 2016/9/15.
 */

public interface GuokrContract {

    interface View extends BaseView<Presenter> {

        void showError();

        void showResults(ArrayList<GuokrHandpickPost.result> list);

        void showLoading();

        void stopLoading();

    }

    interface Presenter extends BasePresenter{

        void setUrl(String url);

        void refresh();

        void startReading(int position);

    }

}
