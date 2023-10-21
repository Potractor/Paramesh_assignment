const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');

    // Reverse each word and join them back into a sentence
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    // Join the reversed words to form the final sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

rl.question("Enter a sentence: ", (inputSentence) => {
    const reversedSentence = reverseWordsInSentence(inputSentence);
    console.log("Reversed sentence:", reversedSentence);
    rl.close();
});
