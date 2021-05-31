package fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.rebirth.shopup.MainFragmentDirections
import com.rebirth.shopup.R
import com.rebirth.shopup.R.*
import com.squareup.picasso.Picasso
import models.Product

/**
 * [RecyclerView.Adapter] that can display a [_root_ide_package_.models.Product].
 * TODO: Replace the implementation with code for your data type.
 */
class MyProductRecyclerViewAdapter(
    private val values: ArrayList<Product>
) : RecyclerView.Adapter<MyProductRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(

            LayoutInflater.from(parent.context)
                .inflate(R.layout.product_preview_item, parent, false)

        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.titleView.text = item.title
        holder.priceView.text = item.price
        Picasso.get().load(item.image).into(holder.imgView)
        holder.imgView.setOnClickListener(View.OnClickListener {
            val navController = Navigation.findNavController(it)
            navController.navigate(MainFragmentDirections.actionMainFragmentToProductFragment(item))


        })
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleView: TextView = itemView.findViewById(R.id.product_preview_title)
        val priceView: TextView = itemView.findViewById(R.id.product_preview_price)
        val imgView: ImageView = itemView.findViewById(R.id.product_preview_img)

        override fun toString(): String {
            return super.toString() + " '" + titleView.text + "'"
        }
    }

}