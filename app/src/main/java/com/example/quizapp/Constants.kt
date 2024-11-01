package com.example.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWER : String = "correct_answer"


    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        //1
        val qus1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.argentina,
            "Argentina", "Australia", "Alameda", "Austria",
            1
        )
        questionList.add(qus1)
        //2
        val qus2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.australia,
            "Argentina", "Alameda", "Austria", "Australia",
            4
        )
        questionList.add(qus2)
        //3
        val qus3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.belgium,
            "Belgium", "Bangladesh", "Brazil", "Belarus",
            1
        )
        questionList.add(qus3)
        //4
        val qus4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.brazil,
            "Belgium", "Bangladesh", "Brazil", "Belarus",
            3
        )
        questionList.add(qus4)
        //5
        val qus5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.denmark,
            "Finland", "Denmark", "France", "Ireland",
            2
        )
        questionList.add(qus5)
        //6
        val qus6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.fiji,
            "Switzerland", "Japan", "fini", "Poland",
            3
        )
        questionList.add(qus6)
        //7
        val qus7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.germany,
            "Luxembourg", "Uganda", "Turkey", "Germany",
            4
        )
        questionList.add(qus7)
        //8
        val qus8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.india,
            "Iceland", "India", "Iraq", "Italy",
            2
        )
        questionList.add(qus8)
        //9
        val qus9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.kuwait,
            "Kuwait", "Korea", "Kazakhstan", "Kenya",
            1
        )
        questionList.add(qus9)
        //10
        val qus10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.thailand,
            "Tunisia", "Turkey", "Taiwan", "Thailand",
            4
        )
        questionList.add(qus10)


        return questionList
    }
}