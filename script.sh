#!/usr/bin/env bash

set -euo pipefail

ROOT="."

echo "Creating Library Management System structure..."

mkdir -p \
  "$ROOT/docs" \
  "$ROOT/data" \
  "$ROOT/src/main/java/com/library/management/model" \
  "$ROOT/src/main/java/com/library/management/enums" \
  "$ROOT/src/main/java/com/library/management/interfaces" \
  "$ROOT/src/main/java/com/library/management/service" \
  "$ROOT/src/main/java/com/library/management/repository" \
  "$ROOT/src/main/java/com/library/management/exception" \
  "$ROOT/src/main/java/com/library/management/storage" \
  "$ROOT/src/main/java/com/library/management/ui" \
  "$ROOT/src/main/java/com/library/management/util" \
  "$ROOT/src/test/java/com/library/management/model" \
  "$ROOT/src/test/java/com/library/management/service" \
  "$ROOT/src/test/java/com/library/management/repository" \
  "$ROOT/src/test/java/com/library/management/util"

touch \
  "$ROOT/README.md" \
  "$ROOT/LICENSE" \
  "$ROOT/.gitignore" \
  "$ROOT/pom.xml" \
  "$ROOT/docs/requirements.md" \
  "$ROOT/docs/architecture.md" \
  "$ROOT/docs/class-diagram.md" \
  "$ROOT/docs/use-cases.md"

touch \
  "$ROOT/src/main/java/com/library/management/Application.java"

touch \
  "$ROOT/src/main/java/com/library/management/model/Book.java" \
  "$ROOT/src/main/java/com/library/management/model/Member.java" \
  "$ROOT/src/main/java/com/library/management/model/StudentMember.java" \
  "$ROOT/src/main/java/com/library/management/model/FacultyMember.java" \
  "$ROOT/src/main/java/com/library/management/model/Librarian.java" \
  "$ROOT/src/main/java/com/library/management/model/Transaction.java"

touch \
  "$ROOT/src/main/java/com/library/management/enums/BookStatus.java" \
  "$ROOT/src/main/java/com/library/management/enums/MemberType.java" \
  "$ROOT/src/main/java/com/library/management/enums/TransactionType.java"

touch \
  "$ROOT/src/main/java/com/library/management/interfaces/Borrowable.java" \
  "$ROOT/src/main/java/com/library/management/interfaces/Searchable.java"

touch \
  "$ROOT/src/main/java/com/library/management/service/BookService.java" \
  "$ROOT/src/main/java/com/library/management/service/MemberService.java" \
  "$ROOT/src/main/java/com/library/management/service/TransactionService.java" \
  "$ROOT/src/main/java/com/library/management/service/LibraryService.java"

touch \
  "$ROOT/src/main/java/com/library/management/repository/BookRepository.java" \
  "$ROOT/src/main/java/com/library/management/repository/MemberRepository.java" \
  "$ROOT/src/main/java/com/library/management/repository/TransactionRepository.java"

touch \
  "$ROOT/src/main/java/com/library/management/exception/LibraryException.java" \
  "$ROOT/src/main/java/com/library/management/exception/BookNotFoundException.java" \
  "$ROOT/src/main/java/com/library/management/exception/BookNotAvailableException.java" \
  "$ROOT/src/main/java/com/library/management/exception/MemberNotFoundException.java" \
  "$ROOT/src/main/java/com/library/management/exception/BorrowLimitExceededException.java"

touch \
  "$ROOT/src/main/java/com/library/management/storage/DataStore.java" \
  "$ROOT/src/main/java/com/library/management/storage/FileDataStore.java"

touch \
  "$ROOT/src/main/java/com/library/management/ui/ConsoleUI.java" \
  "$ROOT/src/main/java/com/library/management/ui/Menu.java" \
  "$ROOT/src/main/java/com/library/management/ui/InputHandler.java"

touch \
  "$ROOT/src/main/java/com/library/management/util/IdGenerator.java" \
  "$ROOT/src/main/java/com/library/management/util/DateUtils.java" \
  "$ROOT/src/main/java/com/library/management/util/ValidationUtils.java"

touch \
  "$ROOT/src/test/java/com/library/management/model/BookTest.java" \
  "$ROOT/src/test/java/com/library/management/model/MemberTest.java" \
  "$ROOT/src/test/java/com/library/management/service/BookServiceTest.java" \
  "$ROOT/src/test/java/com/library/management/service/MemberServiceTest.java" \
  "$ROOT/src/test/java/com/library/management/service/TransactionServiceTest.java" \
  "$ROOT/src/test/java/com/library/management/repository/BookRepositoryTest.java" \
  "$ROOT/src/test/java/com/library/management/repository/MemberRepositoryTest.java" \
  "$ROOT/src/test/java/com/library/management/repository/TransactionRepositoryTest.java" \
  "$ROOT/src/test/java/com/library/management/util/DateUtilsTest.java" \
  "$ROOT/src/test/java/com/library/management/util/ValidationUtilsTest.java"

echo "Project structure created successfully."