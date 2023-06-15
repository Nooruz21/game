package com.example.a4photo1word

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.a4photo1word.databinding.ActivityGameOneBinding

class GameOneActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameOneBinding
    private val CORRECT_WORD = "ИМЯ"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initImage()
        initListener()
        initClearLetter()
    }

    private fun initClearLetter() {
        binding.btnClear.setOnClickListener {
            val text=binding.etLetter.text.toString()
            binding.etLetter.setText(text.substring(0,text.length-1))
            val letter = text[text.length-1]

            if (letter.toString()==binding.letter1.text.toString()){
                binding.letter1.visibility=View.VISIBLE
            }
            if (letter.toString()==binding.letter2.text.toString()){
                binding.letter2.visibility=View.VISIBLE
            }
            if (letter.toString()==binding.letter3.text.toString()){
                binding.letter3.visibility=View.VISIBLE
            }
            if (letter.toString()==binding.letter4.text.toString()){
                binding.letter4.visibility=View.VISIBLE
            }
            if (letter.toString()==binding.letter5.text.toString()){
                binding.letter5.visibility=View.VISIBLE
            }
            if (letter.toString()==binding.letter6.text.toString()){
                binding.letter6.visibility=View.VISIBLE
            }
            if (letter.toString()==binding.letter7.text.toString()){
                binding.letter7.visibility=View.VISIBLE
            }
            if (letter.toString()==binding.letter8.text.toString()){
                binding.letter8.visibility=View.VISIBLE
            }
            if (letter.toString()==binding.letter9.text.toString()){
                binding.letter9.visibility=View.VISIBLE
            }
            if (letter.toString()==binding.letter10.text.toString()){
                binding.letter10.visibility=View.VISIBLE
            }
        }
    }

    private fun initListener() {
        binding.letter1.setOnClickListener {
            binding.etLetter.append(binding.letter1.text.toString())
            binding.letter1.visibility = View.INVISIBLE
        }
        binding.letter2.setOnClickListener {
            binding.etLetter.append(binding.letter2.text.toString())
            binding.letter2.visibility = View.INVISIBLE
        }
        binding.letter3.setOnClickListener {
            binding.etLetter.append(binding.letter3.text.toString())
            binding.letter3.visibility = View.INVISIBLE
        }
        binding.letter4.setOnClickListener {
            binding.letter4.append(binding.letter4.text.toString())
            binding.letter4.visibility = View.INVISIBLE
        }
        binding.letter5.setOnClickListener {
            binding.etLetter.append(binding.letter5.text.toString())
            binding.letter5.visibility = View.INVISIBLE
        }
        binding.letter6.setOnClickListener {
            binding.etLetter.append(binding.letter6.text.toString())
            binding.letter6.visibility = View.INVISIBLE
        }
        binding.letter7.setOnClickListener {
            binding.etLetter.append(binding.letter7.text.toString())
            binding.letter7.visibility = View.INVISIBLE
        }
        binding.letter8.setOnClickListener {
            binding.etLetter.append(binding.letter8.text.toString())
            binding.letter8.visibility = View.INVISIBLE
        }
        binding.letter9.setOnClickListener {
            binding.etLetter.append(binding.letter9.text.toString())
            binding.letter9.visibility = View.INVISIBLE
        }
        binding.letter10.setOnClickListener {
            binding.etLetter.append(binding.letter10.text.toString())
            binding.letter10.visibility = View.INVISIBLE
        }

    }

    private fun initImage() {
        Glide.with(this).load("").centerCrop().into(binding.imageOne)
        Glide.with(this).load("").centerCrop().into(binding.imageTwo)
        Glide.with(this).load("").centerCrop().into(binding.imageThree)
        Glide.with(this).load("").centerCrop().into(binding.imageFour)
    }
}