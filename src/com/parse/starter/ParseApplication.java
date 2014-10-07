package com.parse.starter;

import java.util.List;



//import org.codelearn.codelearnlistexample.R;

import android.app.Application;
import android.util.Log;
import android.widget.Button;

import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;
import com.parse.ParseQuery;
import com.parse.ParseObject;
import com.parse.ParseException;
import android.view.View;;



public class ParseApplication extends Application {


	
  @Override
  public void onCreate() {
    super.onCreate();

    // Add your initialization code here
    Parse.initialize(this, "eo7wLLlQekmYfJJ77gmXhQkTfFC3qK0OvKV8pFYK", "r7dROaatklYbtxk9sG8NhXjGJ63M00KnEEWbBaOx");

    
//    Button simpleAdapter = (Button)findViewById(R.id.agendaButton);

    ParseUser.enableAutomaticUser();
    ParseACL defaultACL = new ParseACL();
      
    // If you would like all objects to be private by default, remove this line.
    defaultACL.setPublicReadAccess(true);
    
    ParseACL.setDefaultACL(defaultACL, true);
    
//    ParseQuery<ParseObject> query = ParseQuery.getQuery("Testimonial");
//    
//    query.findInBackground(new FindCallback<ParseObject>() {
//        public void done(List<ParseObject> scoreList, ParseException e) {
//            if (e == null) {
//            	int numTestimonies = scoreList.size();
//                Log.d("score", "Retrieved " + numTestimonies + " scores");
//            } else {
//                Log.d("score", "Error: " + e.getMessage());
//            }
//        }
//    });
  }

  
}
