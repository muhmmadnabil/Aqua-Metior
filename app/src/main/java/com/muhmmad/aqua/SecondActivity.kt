package com.muhmmad.aqua

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.muhmmad.aqua.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity(), Contract {

    private lateinit var binding: ActivitySecondBinding
    private var phResult = false
    private var saltResult = false
    private var rgbResult = false
    private var ironResult = false
    private var nitrateResult = false
    private var manganeseResult = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MyFirebase(this).readData()
//        MyFirebase(this).addingUser(User(1, "Ahmed", "Shehatah", "", "", 0f, 0f, 0f, 0f, 0f, 0f))
//        binding.tvPhResult.text = user.phValue.toString()
//        binding.tvRgbResult.text = user.rgbValue.toString()
//        binding.tvManganeseResult.text = user.manganeseValue.toString()
//        binding.tvIronResult.text = user.ironValue.toString()
//        binding.tvSlatResult.text = user.saltValue.toString()
//        binding.tvNitreseResult.text = user.nitrateValue.toString()

//
//        binding.tvPhResult.text = "5"
//        binding.tvRgbResult.text = "70"
//        binding.tvManganeseResult.text = "4"
//        binding.tvIronResult.text = "0.5"
//        binding.tvSlatResult.text = "900"
//        binding.tvNitreseResult.text = "70"

        when (binding.tvPhResult.text) {
            0 downTo 7 -> {

            }
            9 downTo 14 -> {

            }
            else -> {
                phResult = true
            }
        }

        when (binding.tvSlatResult.text) {
            900 downTo 1200 -> {

            }
            else -> {
                saltResult = true
            }
        }

        when (binding.tvIronResult.text) {
            1 downTo 100 -> {

            }
            else -> {
                ironResult = true
            }
        }

        when (binding.tvNitreseResult.text) {
            0 downTo 45 -> {
                nitrateResult = true
            }
            else -> {

            }
        }
        when (binding.tvManganeseResult.text) {
            0 downTo 5 -> {
                manganeseResult = true
            }
        }

        when (binding.tvRgbResult.text) {
            50 downTo 500 -> {

            }
            else -> {
                rgbResult = true
            }
        }

        if (phResult && saltResult && ironResult && nitrateResult && manganeseResult) {
            binding.tvResult.text = "المياة جيدة"
        } else {
            binding.tvResult.text = "المياة سيئة"
        }


    }

    override fun onSuccess(user: User) {

        binding.tvPhResult.text = user.phValue.toString()
        binding.tvRgbResult.text = user.rgbValue.toString()
        binding.tvManganeseResult.text = user.manganeseValue.toString()
        binding.tvIronResult.text = user.ironValue.toString()
        binding.tvSlatResult.text = user.saltValue.toString()
        binding.tvNitreseResult.text = user.nitrateValue.toString()
    }
}