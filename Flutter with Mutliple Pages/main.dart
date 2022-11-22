import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      //home: BaseApp(),
      initialRoute: '/',
      routes: <String, WidgetBuilder>{
        '/': (context) => BaseApp(),
        '/LoginAsUser': (context) => LoginAsUser(),
        '/LoginAsGuest': (context) => LoginAsGuest()
      },
    );
  }
}

class BaseApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text("MPA Application"),
        ),
        body: Center(
          child: Column(
            children: <Widget>[
              ElevatedButton(
                style: ElevatedButton.styleFrom(backgroundColor: Colors.teal),
                child: Text("Login As User"),
                onPressed: () {
                  Navigator.pushNamed(context, '/LoginAsUser');
                },
              ),
              ElevatedButton(
                style: ElevatedButton.styleFrom(backgroundColor: Colors.red),
                child: Text("Login as Guest"),
                onPressed: () {
                  Navigator.pushNamed(context, '/LoginAsGuest');
                },
              ),
            ],
          ),
        ));
  }
}

class LoginAsUser extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text("Welcome User..."),
        ),
        body: ElevatedButton(
            style: ElevatedButton.styleFrom(backgroundColor: Colors.blue),
            child: Text("Go back"),
            onPressed: () {
              Navigator.pop(context);
            }));
  }
}

class LoginAsGuest extends StatelessWidget {
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(title: Text("Welcome Guest...")),
        body: ElevatedButton(
            style: ElevatedButton.styleFrom(backgroundColor: Colors.blue),
            child: Text("Go back"),
            onPressed: () {
              Navigator.pop(context);
            }));
  }
}
