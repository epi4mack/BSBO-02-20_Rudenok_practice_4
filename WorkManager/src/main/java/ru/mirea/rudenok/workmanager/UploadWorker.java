package ru.mirea.rudenok.workmanager;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import java.util.concurrent.TimeUnit;

public class UploadWorker extends Worker {
    static final String TAG = "smelkin worker";

    public UploadWorker(
            @NonNull Context context,
            @NonNull WorkerParameters params) {
        super(context, params);
    }
    @Override
    public Result doWork() {

        Log.d(TAG, "doWork: start");
        Looper.prepare();
        Toast.makeText(this.getApplicationContext(), "Start", Toast.LENGTH_SHORT).show();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.d(TAG, "doWork: end");
        return Result.success();
    }
}