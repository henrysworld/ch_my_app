package com.ch.ch_my_app.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ch.ch_my_app.R;

/**
 * Created by Administrator on 2016/2/18.
 */
public class PagerListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView rv = (RecyclerView) inflater.inflate(R.layout.fragment_pager_list, null);
        return rv;
    }

    private void setupRecyclerView(RecyclerView recyclerView){

    }


//    public class SimpleStringRecyclerViewAdapter extends RecyclerView.Adapter{
//        public static class ViewHolder extends RecyclerView.ViewHolder{
//            public
//        }
//    }
}
