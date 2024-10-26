package com.example.quizapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class QuizQuestionsActivity : AppCompatActivity() {

    private var tvQuestion: TextView? = null
    private var tvImage: ImageView? = null
    private var progreeBar: ProgressBar? = null
    private var tvProgree: TextView? = null
    private var tvOptionOne: TextView? = null
    private var tvOptionTwo: TextView? = null
    private var tvOptionThree: TextView? = null
    private var tvOptionFour: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz_questions)

        tvQuestion = findViewById(R.id.tvQuestion)
        tvImage = findViewById(R.id.tvImage)
        progreeBar = findViewById(R.id.progressBar)
        tvProgree = findViewById(R.id.tvProgress)
        tvOptionOne = findViewById(R.id.tvOptionOne)
        tvOptionTwo = findViewById(R.id.tvOptionTwo)
        tvOptionThree = findViewById(R.id.tvOptionThree)
        tvOptionFour = findViewById(R.id.tvOptionFour)


        val questionList = Constants.getQuestions()


        for (i in questionList){

        }
        val currentPosition = 1
        val question: Question = questionList[currentPosition -1]

        progreeBar?.progress = currentPosition
        tvProgree?.text = "$currentPosition/${progreeBar?.max}"
        tvQuestion?.text = question.questions
        tvImage?.setImageResource(question.image)

        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour

    }
}