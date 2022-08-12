# Demo-Notification

IOS 

1. Open your Xcode project workspace (ios/Runner.xcworkspace).
2. Enable push notifications.
3. Enable the Background fetch and the Remote notifications background execution modes.
4. Inside your project in the Firebase console, select the gear icon, select Project Settings, and then select the Cloud Messaging tab.
5. Select the Upload Certificate button for your development certificate, your production certificate, or both. At least one is required.
6. For each certificate, select the .p12 file, and provide the password, if any. Make sure the bundle ID for this certificate matches the bundle ID of your app. Select Save.


IN FLUTTER: 
in termninate :
flutter pub add firebase_messaging 
flutter run 

LOGIN FIREBASE: 

1. curl -sL https://firebase.tools | bash
2. firebase login
3. firebase init
![250965080_1122610114811830_1511003462758641319_n](https://user-images.githubusercontent.com/67619595/184312533-69640616-7909-4e15-96b0-3e87bdb12f50.png)
