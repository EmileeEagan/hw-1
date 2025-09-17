
let ticketPrice = 14.00;
let numTickets = 3;
let totalCostDating = ticketPrice * numTickets;
console.log("Dating - Total Cost:", totalCostDating); // $42


// --- Shopping ---
let bankBalance = 235.87;
let shirt = 35;
let pants = 75;
let shoes = 60;

let outfitTotal = shirt + pants + shoes;
let remainingBalance = bankBalance - outfitTotal;
console.log("Shopping - Remaining Balance after outfit:", remainingBalance); // $65.87

let jacket = 70;
let canAffordJacket = remainingBalance >= jacket;
console.log("Shopping - Can afford jacket:", canAffordJacket); // false


// --- Pizza ---
let pizzasBought = 4;
let slicesPerPizza = 8;
let totalSlices = pizzasBought * slicesPerPizza; // 32 slices
let students = 12;
let slicesPerStudent = 2.5;

let slicesNeeded = students * slicesPerStudent; // 30 slices
let slicesLeft = totalSlices - slicesNeeded; // 2 slices
console.log("Pizza - Slices Left for Rector:", slicesLeft); // 2


// --- Monty's Mega Bar ---
let adultPrice = 12.00;
let childPrice = 6.00;
let drinkPrice = 1.50;

let numAdults = 2;
let numChildren = 1;
let numDrinks = 3;

let mealTotal = (numAdults * adultPrice) + (numChildren * childPrice) + (numDrinks * drinkPrice);
console.log("Monty's Mega Bar - Total Meal Cost:", mealTotal); // $34.50


// --- Average Earned Tips ---
let week1 = 202.45;
let week2 = 134.97;
let week3 = 256.63;
let week4 = 178.22;

let totalTips = week1 + week2 + week3 + week4;
let weeklyAverage = totalTips / 4;
console.log("Average Earned Tips - Weekly Average:", weeklyAverage); // ~$193.07
