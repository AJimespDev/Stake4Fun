package com.example.stake4fun.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.stake4fun.MainActivity
import com.example.stake4fun.R

class SplashFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onStart() {
        super.onStart()

        (activity as MainActivity).setAppBarGone()

        var r = Runnable {
            findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
        }
        Handler(Looper.getMainLooper()).postDelayed(r, 2000)
    }


}