def encryption(shift: Int, str: String): String = {
    str.map{ i =>
        if(i.isLetter){
            val base = if(i.isUpper) 'A' else 'a'
            ((i - base + shift) % 26 + base).toChar
        }
        else{
            i
        }
    }
}

def decryption(shift: Int, decstr: String): String = {
    decstr.map{ i =>
        if(i.isLetter){
            val base = if(i.isUpper) 'A'else 'a'
            ((i - base - shift + 26) % 26 + base).toChar
        }
        else{
            i
        }
    }
}

def cipher(shift: Int, str: String)(function: (Int, String) => String): String = {
    function(shift, str)
}

@main def practical8_1() : Unit = {
    val str = "abczA1 3eR"
    val str1 = cipher(2, str)(encryption)
    val str2 = cipher(2, str1)(decryption)
    println(str1+ '\n'+ str2)
}