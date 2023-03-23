package com.kirmizitech.listfragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.ListFragment

class MyListFragment : ListFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //val arrayAdapter = ArrayAdapter.createFromResource(activity,R.array.cities,android.R.layout.simple_list_item_1)
        //val arrayAdapter = ArrayAdapter.createFromResource(requireActivity(),R.array.cities,android.R.layout.simple_list_item_1)

        //Wrap with '?.let { ... }' call
        //önce etkinlik parametresi kontrol edilecek ve boş değilse {içerisindeki kod çalışacaktır}
        //it : anahtar kelime aynı zamanda activity parametresini de temsil eder
        val arrayAdapter = activity?.let {
            ArrayAdapter.createFromResource(it,R.array.cities,android.R.layout.simple_list_item_1) }

        listAdapter = arrayAdapter

        //liste görünümüne tıklama dinleyicisi ekliyoruz
        listView.setOnItemClickListener { adapterView, view, position, l ->

            val intent = Intent(activity,SecondActivity::class.java)
            intent.putExtra("position",position)
            startActivity(intent)

        }

    }

}