const display = document.getElementById("display");

function appendToDisplay(input) {
    display.value += input;
}

function clearDisplay() {
    display.value = "";
}

function delLast() {
    val = display.value;
    display.value = val.slice(0, -1);
}

function calculate() {
    try {
        display.value = eval(display.value);
    }

    catch (error) {
        display.value = "Error";
    }
}