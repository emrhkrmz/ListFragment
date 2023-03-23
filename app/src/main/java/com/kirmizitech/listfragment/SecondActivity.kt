package com.kirmizitech.listfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        /**
         So now when I click on any element in the list, both the second activity and
         therefore the second fragment will open.
         */
        val position = intent.getIntExtra("position",0)

        /**
         Ok, so I want to add the second fragment inside second activity,
         so I'll do this process just like.
         */
        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()

        val secondFragment = SecondFragment()

        /**
         But we're going to use bundle instead of intent between activity and fragment.
         */
        val bundle = Bundle()
        bundle.putInt("position",position)
        secondFragment.arguments = bundle

        fragmentTransaction.add(R.id.frameLayout,secondFragment)

        fragmentTransaction.commit()
        /**
         So that way, the second fragment was added to the second activity.
         So when I open the second activity, the second fragment will open automatically.
         So that means I must open this second activity inside.
         Click listener of the ListView.
         */

    }
}