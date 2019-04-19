package com.scalaApps.goodsMaintainer

class Product(productName:String,price:Double,availableStock:Int,minimumStock:Int,margin:Double){
  println(s"Added Product: $productName, Price: $price, and Stock: $availableStock")
  private val prod = productName
  private val pri = price
  private val min = minimumStock
  private var stock:Int = availableStock
  private val profitMargin = margin
  private var currentSale:Int = 0
  override def toString: String = s"$productName,$price,$stock"

  def getStock={
    println(s"Available Stock of the $prod: $stock")
    stock
  }

  def minStock={
    min
  }

  def buyNewStock(quantity:Int)={
    currentSale-=quantity
    stock+=quantity
  }

  def sellProduct(sale: Int)={
    currentSale += sale
    stock-=sale
  }

  def getSaleOnProduct={
//    println(s"Sale for the product $prod:")
    currentSale*pri
  }

  def getProfitOnProduct={
//    println(s"Profit on the product: $prod")
    currentSale*profitMargin
  }

  def getPrice={
    price
  }
  def getProductName={
    productName
  }
}

object Product{
  def apply(productName: String, price: Double,availableStock:Int,minimumStock:Int,margin:Double): Product = new Product(productName, price,availableStock,minimumStock,margin)
}

