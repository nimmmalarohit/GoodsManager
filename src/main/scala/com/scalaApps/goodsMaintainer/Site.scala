package com.scalaApps.goodsMaintainer

class Site(name:String,products:Set[Product]) {
  private val siteName = name
  private val prods:Set[Product] = products
  println(s"Created new site $siteName")
  override def toString: String = s"$name$products"

  def getSiteName={
    siteName
  }

  def listAllProducts = {
    println(" ")
    println(s"Below are the products Available in $siteName:")
    prods.map(prdct => println(prdct.getProductName,prdct.getStock))
  }

  def lowInStock={
    println(" ")
    println(s"In $siteName Below are the products which are low in stock:")
    prods.map(prods => if(prods.getStock <= prods.minStock) println(prods.getProductName))
  }

  def getSale={
    prods.map(values => values.getSaleOnProduct).reduce(_+_)
  }

  def getProfit={
    prods.map(values => values.getProfitOnProduct).reduce(_+_)
  }
}

object Site{
  def apply(name: String, products: Set[Product]): Site = new Site(name, products)
}