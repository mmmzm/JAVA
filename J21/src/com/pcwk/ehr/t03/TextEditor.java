package com.pcwk.ehr.t03;

import java.util.Stack;

public class TextEditor {
	private StringBuilder text;
    private Stack<String> history;

    public TextEditor() {
        text = new StringBuilder();
        history = new Stack<>();
    }

    // 텍스트에 문자열 추가
    public void append(String str) {
        history.push(text.toString()); // 이전 텍스트를 히스토리에 저장
        text.append(str);
    }

    // 가장 나중에 수정한 구절 취소
    public void undo() {
        if (!history.isEmpty()) {
            text = new StringBuilder(history.pop()); // 히스토리에서 가장 최근 텍스트로 복원
        }
    }

    // 현재 텍스트 반환
    public String getText() {
        return text.toString();
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.append("Hello, ");
        editor.append("World!");
        System.out.println("Current Text: " + editor.getText()); // 출력: Hello, World!

        editor.undo(); // 마지막 작업 취소
        System.out.println("Text after Undo: " + editor.getText()); // 출력: Hello,
    }
}
//Current Text: Hello, World!
//Text after Undo: Hello, 