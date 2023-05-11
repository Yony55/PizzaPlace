package mx.tec.pizzaplace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class PizzaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)

        val name = intent.getStringExtra("Name")
        val price = intent.getStringExtra("Price")
        var pizzaName = findViewById<TextView>(R.id.pizzaName)
        var pizzaImage = findViewById<ImageView>(R.id.pizzaImage)
        var pizzaPrice = findViewById<TextView>(R.id.pizzaPrice)
        var pizzaDescrption = findViewById<TextView>(R.id.pizzaDesc)

        pizzaName.setText(name)
        pizzaPrice.setText(price)
        if(price == "$999.99"){
            pizzaImage.setImageResource(R.drawable.pizzaesp)
            pizzaDescrption.setText("Ingredientes: Salami, chorizo, tocino, tomate.")
        } else if(price == "$699.69"){
            pizzaImage.setImageResource(R.drawable.pizzamarg)
            pizzaDescrption.setText("Ingredientes: Tomate, albahaca, mozzarella.")
        } else if(price == "$420.69"){
            pizzaImage.setImageResource(R.drawable.pizzamini)
            pizzaDescrption.setText("3 Mini Pizzas de Pepperoni.")
        } else if(price == "$9999.99"){
            pizzaImage.setImageResource(R.drawable.pizzaori)
            pizzaDescrption.setText("Pizza de Pepperoni con orilla de queso Mozzarella.")
        } else{
            pizzaImage.setImageResource(R.drawable.pizzapep)
            pizzaDescrption.setText("Ingredientes: Pepperoni.")
        }
    }
}