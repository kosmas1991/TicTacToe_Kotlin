package gr.techzombie.tictactoe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    var winner:Int?=null
    var currentPlayer = 1
    var player1List = ArrayList<Int>()
    var player2List = ArrayList<Int>()

    fun buttonPressed(view:View){
        var buttonSelected:Int?=null
        var currentButton = view as Button
        when(currentButton.id) {
            R.id.button1 -> buttonSelected = 1
            R.id.button2 -> buttonSelected = 2
            R.id.button3 -> buttonSelected = 3
            R.id.button4 -> buttonSelected = 4
            R.id.button5 -> buttonSelected = 5
            R.id.button6 -> buttonSelected = 6
            R.id.button7 -> buttonSelected = 7
            R.id.button8 -> buttonSelected = 8
            R.id.button9 -> buttonSelected = 9
        }
        Toast.makeText(this,"Button " + buttonSelected + " pressed",Toast.LENGTH_SHORT).show()
        playGame(currentButton,buttonSelected!!)

    }


    fun playGame(daButton:Button,buttonNumber:Int){
        if(currentPlayer == 1){
            daButton.text="X"
            player1List.add(buttonNumber)
            daButton.setBackgroundColor(Color.RED)
            daButton.isEnabled=false
            currentPlayer=2
        }
        else if(currentPlayer == 2) {
            daButton.text="O"
            player2List.add(buttonNumber)
            daButton.setBackgroundColor(Color.GREEN)
            daButton.isEnabled=false
            currentPlayer=1
        }
        checkWinner()
    }

    fun checkWinner(){
        //player 1
        if(player1List.contains(1) && player1List.contains(2) && player1List.contains(3)){
            winner = 1
            textView.text="Player 1 Won!!!"
        }
        if(player1List.contains(4) && player1List.contains(5) && player1List.contains(6)){
            winner = 1
            textView.text="Player 1 Won!!!"
        }
        if(player1List.contains(7) && player1List.contains(8) && player1List.contains(9)){
            winner = 1
            textView.text="Player 1 Won!!!"
        }
        if(player1List.contains(1) && player1List.contains(4) && player1List.contains(7)){
            winner = 1
            textView.text="Player 1 Won!!!"
        }
        if(player1List.contains(2) && player1List.contains(5) && player1List.contains(8)){
            winner = 1
            textView.text="Player 1 Won!!!"
        }
        if(player1List.contains(3) && player1List.contains(6) && player1List.contains(9)){
            winner = 1
            textView.text="Player 1 Won!!!"
        }
        if(player1List.contains(1) && player1List.contains(5) && player1List.contains(9)){
            winner = 1
            textView.text="Player 1 Won!!!"
        }
        if(player1List.contains(3) && player1List.contains(5) && player1List.contains(7)){
            winner = 1
            textView.text="Player 1 Won!!!"
        }
        //player 2
        if(player2List.contains(1) && player2List.contains(2) && player2List.contains(3)){
            winner = 2
            textView.text="Player 2 Won!!!"
        }
        if(player2List.contains(4) && player2List.contains(5) && player2List.contains(6)){
            winner = 2
            textView.text="Player 2 Won!!!"
        }
        if(player2List.contains(7) && player2List.contains(8) && player2List.contains(9)){
            winner = 2
            textView.text="Player 2 Won!!!"
        }
        if(player2List.contains(1) && player2List.contains(4) && player2List.contains(7)){
            winner = 2
            textView.text="Player 2 Won!!!"
        }
        if(player2List.contains(2) && player2List.contains(5) && player2List.contains(8)){
            winner = 2
            textView.text="Player 2 Won!!!"
        }
        if(player2List.contains(3) && player2List.contains(6) && player2List.contains(9)){
            winner = 2
            textView.text="Player 2 Won!!!"
        }
        if(player2List.contains(1) && player2List.contains(5) && player2List.contains(9)){
            winner = 2
            textView.text="Player 2 Won!!!"
        }
        if(player2List.contains(3) && player2List.contains(5) && player2List.contains(7)){
            winner = 2
            textView.text="Player 2 Won!!!"
        }
    }
}
