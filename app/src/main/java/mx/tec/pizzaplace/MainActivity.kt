package mx.tec.pizzaplace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import mx.tec.pizzaplace.model.Pizza

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listPizza = findViewById<ListView>(R.id.listPizza)
        val data = listOf(
            Pizza("Pizza Española", R.drawable.pizzaesp, "$999.99"),
            Pizza("Pizza Margherita", R.drawable.pizzamarg, "$699.69"),
            Pizza("Mini Pizzas (3pc)", R.drawable.pizzamini, "$420.69"),
            Pizza("Pizza Orilla de Queso", R.drawable.pizzaori, "$9999.99"),
            Pizza("Pizza Pepperoni", R.drawable.pizzapep, "$299.99")
        )

        val adapter = ElementAdapter(this, R.layout.pizza_layout, data)

        listPizza.adapter = adapter

        listPizza.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, PizzaActivity::class.java)
            intent.putExtra("Name", data[position].name)
            intent.putExtra("Image", data[position].logo)
            intent.putExtra("Price", data[position].price)
            startActivity(intent)
        }
    }
}