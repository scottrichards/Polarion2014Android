package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import com.parse.ParseAnalytics;
import com.parse.ParseQueryAdapter;

import com.parse.starter.Agenda;

import android.app.ListActivity;
import android.content.Intent;

public class ParseStarterProjectActivity extends ListActivity {
	private ParseQueryAdapter<Agenda> agendaAdapter;
	private AgendaQueryAdapter agendaQueryAdapter;
	
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.main);

		agendaAdapter = new ParseQueryAdapter<Agenda>(this, Agenda.class);
		setListAdapter(agendaAdapter);
		agendaAdapter.setTextKey("session");
		
//		agendaQueryAdapter = new AgendaQueryAdapter(this);
//		setListAdapter(agendaQueryAdapter);

		ParseAnalytics.trackAppOpened(getIntent());
	}
	
	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (resultCode == Activity.RESULT_OK) {
			// If a new post has been added, update
			// the list of posts
			updateAgendaList();
		}
	}
	
	private void updateAgendaList() {
		agendaQueryAdapter.loadObjects();
		setListAdapter(agendaQueryAdapter);
	}
}
