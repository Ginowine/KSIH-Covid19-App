package com.android.ksih_covid_19_app.ui.summary

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ksih_covid_19_app.R
import com.android.ksih_covid_19_app.model.Country
import com.android.ksih_covid_19_app.model.Summary
import kotlinx.android.synthetic.main.summary_list_item.view.*
import org.w3c.dom.Text

class SummaryAdapter(private val mainSummaryViewModel: MainSummaryViewModel) :
    RecyclerView.Adapter<SummaryAdapter.ViewHolder>(){

    var summary: List<Country> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.summary_list_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount() = summary.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val virus = summary[position]
        holder.countryName.text = virus.Country
        holder.newConfirmed.text = virus.NewConfirmed.toString()
        holder.totalConfirmed.text = virus.TotalConfirmed.toString()
        holder.newDeath.text = virus.NewDeaths.toString()
        holder.totalDeath.text = virus.TotalDeaths.toString()
        holder.newRecovered.text = virus.NewRecovered.toString()
        holder.totalRecovered.text = virus.TotalRecovered.toString()

    }

    fun updateSummaryList( summary: List<Country>){
        this.summary = summary
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val countryName: TextView = itemView.findViewById(R.id.summary_country)
        val newConfirmed: TextView = itemView.findViewById(R.id.summary_newConfirmed)
        val totalConfirmed: TextView = itemView.findViewById(R.id.summary_totalConfirmed)
        val newDeath: TextView = itemView.findViewById(R.id.summary_newDeath)
        val totalDeath: TextView = itemView.findViewById(R.id.summary_totalDeath)
        val newRecovered: TextView = itemView.findViewById(R.id.summary_newRecovered)
        val totalRecovered: TextView = itemView.findViewById(R.id.summary_totalRecovered)

        val countryFlag: ImageView = itemView.findViewById(R.id.summary_countryFlag)
    }
}