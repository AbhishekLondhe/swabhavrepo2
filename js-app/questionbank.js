

    Array.prototype.random = function (length) {
        return this[Math.floor((Math.random() * length))];
    }


    var questionbank = [{
        id: 1,
        question: "Which one is the first search engine in internet",
        options: ["google", "archie", "altavista", "wais"],
        answer: 1
    },

    {
        id: 2,
        question: ".gif is extension of",
        options: ["video file", "image file", "audio file", "word file"],
        answer: 1
    },

    {
        id: 3,
        question: "Which of the following type of variable is visible everywhere in your JavaScript code?",
        options: ["global", "local", "both", "none"],
        answer: 0
    },

    {
        id: 4,
        question: "which of the following is not an operating system",
        options: ["dos", "mac", "c", "linux"],
        answer: 2
    },

    {
        id: 5,
        question: "Which built-in method combines the text of two strings and returns a new string?",
        options: ["append()", "concat()", "attach()", "none"],
        answer: 1
    },

    {
        id: 6,
        question: "mac os is developed by which company",
        options: ["texas", "ny", "california", "washington"],
        answer: 3
    },

    {
        id: 7,
        question: "Which of the following function of Number object returns a string value version of the current number?",
        options: ["tostring()", "tofixed()", "tolocalestring()", "topreciaion()"],
        answer: 0

    },
    {
        id: 8,
        question: "Which of the following function of String object executes the search for a match between a regular expression and a specified string?",
        options: ["concat()", "match()", "replace()", "search()"],
        answer: 3
    },
    {
        id: 9,
        question: "Which of the following function of String object causes a string to be displayed as struck-out text, as if it were in a <strike> tag?",
        options: ["sup()", "small()", "strike()", "sub()"],
        answer: 2
    },
    {
        id: 10,
        question: "Which of the following function of String object creates a string to be displayed as bold as if it were in a <b> tag?",
        options: ["anchor()", "big()", "blink()", "bold()"],
        answer: 3
    }
    ]


