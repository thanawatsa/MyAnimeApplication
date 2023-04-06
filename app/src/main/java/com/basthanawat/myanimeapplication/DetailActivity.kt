package com.basthanawat.myanimeapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.basthanawat.myanimeapplication.network.newmodel.Data
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    companion object {
        val detailData = "DETAIL"
        fun init(activity: Context, data: Data) {
            val intent = Intent(activity, DetailActivity::class.java)
            intent.putExtra(detailData,data)
            activity.startActivity(intent)

        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val title = findViewById<TextView>(R.id.textTitle)
        val detailImage = findViewById<ImageView>(R.id.detailImage)
        val textDetail = findViewById<TextView>(R.id.textDetail)
        val textBackGroung = findViewById<TextView>(R.id.textBackground)

        val intent = intent
        val detailData = intent.getParcelableExtra<Data>(detailData)

        title.text = detailData?.title

        Glide.with(detailImage)
            .load(detailData?.images?.jpg?.image_url)
            .into(detailImage)

        textDetail.text = detailData?.synopsis

        textBackGroung.text = detailData?.background




    }

}
