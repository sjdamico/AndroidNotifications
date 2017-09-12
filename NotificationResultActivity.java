package usercomms.joemarini.example.com.usercommunications;

import android.app.NotificationManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NotificationResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_result);

        // When launched from an addAction Intent, we must manually cancel
        // the notification otherwise it will stay in the status bar
        Intent intent = getIntent();
        int notifyID = intent.getIntExtra("notifyID", 0);

        NotificationManager mgr = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        mgr.cancel(notifyID);
    }
}
