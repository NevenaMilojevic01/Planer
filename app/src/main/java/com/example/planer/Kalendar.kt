package com.example.planer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.provider.CalendarContract.Events
import android.widget.Button
import android.widget.CalendarView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.planer.databinding.ActivityKalendarBinding

class Kalendar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalendar)

        val kalendar = findViewById<CalendarView>(R.id.calendarView);

        kalendar.setOnClickListener {
            val intent = Intent(Intent.ACTION_INSERT)
                .setData(Events.CONTENT_URI)
                .putExtra(Events.TITLE, "My Events")
                .putExtra(Events.EVENT_LOCATION, "Here")
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, System.currentTimeMillis())
                .putExtra(
                    CalendarContract.EXTRA_EVENT_END_TIME,
                    System.currentTimeMillis() + (60 * 60 * 1000)
                )
            startActivity(intent)

        }
    }
}

