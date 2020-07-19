object Ceaser {
	  def main(args: Array[String]): Unit = {
		
		val asciiSize : Int = 255
		var key =1
		var str :String = "AbCD"

		val encrypt = (c:Char, key:Int) => (((c.toInt+key)%asciiSize).toChar)
		val decrypt = (c:Char, key:Int) => (((if(c.toInt<key) asciiSize+(c.toInt-key) else(c.toInt-key))%asciiSize).toChar)


		var pp =str.toCharArray.map(x=>encrypt(x,key))
		var result1 = pp.mkString("")

		var ppp =result1.toCharArray.map(x=>decrypt(x,key))
		var result2 = ppp.mkString("")
		
		println(result1)
		println(result2)
	  }
	}
