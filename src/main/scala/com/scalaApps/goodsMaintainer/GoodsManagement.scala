package com.scalaApps.goodsMaintainer

object GoodsManagement extends App {
  val laysGreen = new Product("Lays-American-Onion",10,20,5,1)
  val tea = new Product("Tea",9,20,10,4)
  val coffee = new Product("Coffee",10,20,10,0.80)
  val thirdFloorProducts = Set(laysGreen,tea,coffee)
  val thirdFloorPantry = new Site("3rdFloor ",thirdFloorProducts)

/*  println(tea.getStock)
  tea.sellProduct(3)
  println(tea.getProductName,tea.getPrice,tea.getStock)
  thirdFloorPantry.listAllProducts
  tea.sellProduct(10)
  laysGreen.getStock*/

  laysGreen.sellProduct(4)
  tea.sellProduct(20)
  coffee.sellProduct(8)
/*
  thirdFloorPantry.listAllProducts
  thirdFloorPantry.lowInStock
*/

  println("Sale: "+thirdFloorPantry.getSale)
  println("Profit: "+ thirdFloorPantry.getProfit)

  thirdFloorProducts.map(attrib => println("Sale on "+attrib.getProductName+": "+attrib.getSaleOnProduct))
  thirdFloorProducts.map(attrib => println("Profit on "+attrib.getProductName+": "+attrib.getProfitOnProduct))

}
