package com.kirmizitech.listfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class SecondFragment : Fragment() {

    lateinit var imageView: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        /**
        We're not going to be able to use the fine viw by I.D. function directly.
         */
        val view: View = inflater.inflate(R.layout.fragment_second, container, false)
        imageView = view.findViewById(R.id.imageView)

        val position = arguments?.getInt("position", 0)

        when (position) {
            0 -> imageView.setImageResource(R.drawable.berlin)
            1 -> imageView.setImageResource(R.drawable.athens)
            2 -> imageView.setImageResource(R.drawable.rome)
            3 -> imageView.setImageResource(R.drawable.tokyo)
            4 -> imageView.setImageResource(R.drawable.amsterdam)
        }

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_second, container, false)
        return view
    }

}