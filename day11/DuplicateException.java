package day11;

class DuplicateException extends Exception {
    DuplicateException() {
    super("중복된 로또 번호가 발생했습니다.");
    
    }
}
