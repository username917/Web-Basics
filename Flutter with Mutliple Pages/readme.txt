The file in this folder is meant to show you how to create navigating among two pages in a Flutter project.

THe code is based on this tutorial:
https://www.youtube.com/watch?v=OA2fAps2-eI

Note that there are two updates:

1) The components "FlatButton" and "RaisedButton" are deprecated since that tutorial was made.
2) The replacement code looks like this: 

	ElevatedButton(
      		style: ElevatedButton.styleFrom(backgroundColor: Colors.red),
		child: Text("Login as Guest"),
                onPressed: () {
                  Navigator.pushNamed(context, '/LoginAsGuest');
         },

Note that the syntax has changed to "ElevatedButton" and the styling is separate from the function call that
belongs to the button, separated by a comma form the event handler.