package com.example.tungut.weatherwidget.global;

import android.content.Context;
import android.os.AsyncTask;

/**
 * Created by TungUT on 6/26/2017.
 */

public class AsyncTasks {

    public class CheckInternetConnectionAsyncTask extends AsyncTask<Integer, Integer, Void> {

        private Context context;
        private Boolean active;

        public CheckInternetConnectionAsyncTask(Context context) {
            this.context = context;
        }

        @Override
        protected Void doInBackground(Integer... params) {
            active = Global.hasActiveInternetConnection(context);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {

        }
    }
}
