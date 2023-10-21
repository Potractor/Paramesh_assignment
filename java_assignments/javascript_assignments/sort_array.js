function sortArrayDescending(arr) {
    return arr.sort((a, b) => b - a);
}

const numbers = [4, 2, 8, 1, 5, 9];
const sortedArray = sortArrayDescending(numbers);
console.log(sortedArray);
