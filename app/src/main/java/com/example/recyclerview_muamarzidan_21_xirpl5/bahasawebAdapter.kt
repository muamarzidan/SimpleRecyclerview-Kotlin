package com.example.recyclerview_muamarzidan_21_xirpl5

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class bahasawebAdapter(private val context: Context, private val bahasaWeb: List<BahasaWeb>, val listener: (BahasaWeb) -> Unit)
    : RecyclerView.Adapter<bahasawebAdapter.BahasaWebViewHolder>(){
    
    class BahasaWebViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgbahasaweb = view.findViewById<ImageView>(R.id.img_item_photo)
        val namebahasaweb = view.findViewById<TextView>(R.id.tv_item_name)
        val descbahasaweb = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(bahasaWeb: BahasaWeb, listener: (BahasaWeb) -> Unit) {
            imgbahasaweb.setImageResource(bahasaWeb.imgbahasaweb)
            namebahasaweb.text = bahasaWeb.namebahasaweb
            descbahasaweb.text = bahasaWeb.descbahasaweb
            itemView.setOnClickListener{
                listener(bahasaWeb)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BahasaWebViewHolder {
        return BahasaWebViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_bahasaweb, parent, false)
        )
    }

    override fun onBindViewHolder(holder: BahasaWebViewHolder, position: Int) {
        holder.bindView(bahasaWeb[position], listener)
    }

    override fun getItemCount(): Int = bahasaWeb.size
    }