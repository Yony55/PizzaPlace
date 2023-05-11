package mx.tec.pizzaplace

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import mx.tec.pizzaplace.model.Pizza

class ElementAdapter(val context: Context,
                     val layout: Int,
                     val data: List<Pizza>): BaseAdapter() {
    override fun getCount(): Int {
        return data.size
    }

    override fun getItem(position: Int): Any {
        return data[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = inflater.inflate(layout, parent, false)
        val name = view.findViewById<TextView>(R.id.textPizzaName)
        val image = view.findViewById<ImageView>(R.id.imagePizza)
        val price = view.findViewById<TextView>(R.id.textPizzaPrice)
        val element = getItem(position) as Pizza
        name.text = element.name
        image.setImageResource(element.logo)
        price.text = element.price
        return view
    }
}