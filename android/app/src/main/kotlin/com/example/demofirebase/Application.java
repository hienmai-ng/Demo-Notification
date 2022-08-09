package com.example.demofirebase;

// ...
import io.flutter.app.FlutterApplication;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.GeneratedPluginRegistrant;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;

public class Application extends FlutterApplication {
    // ...
    @Override
    public void onCreate() {
        super.onCreate();
      //  FlutterFirebaseMessagingBackgroundService.setPluginRegistrant(this);
    }

}