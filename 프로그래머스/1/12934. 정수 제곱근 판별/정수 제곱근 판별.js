function solution(n) {
    const su = Math.sqrt(n);
    if (Number.isInteger(su)) {
        return (su + 1) ** 2;
    }
    return -1;
}