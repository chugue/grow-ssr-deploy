package shop.mtcoding.blog.model.file;

import jakarta.persistence.EntityManager;
import jakarta.servlet.http.HttpSession;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import shop.mtcoding.blog._core.errors.exception.Exception401;
import shop.mtcoding.blog._core.errors.exception.Exception403;
import shop.mtcoding.blog._core.errors.exception.Exception404;
import shop.mtcoding.blog.model.user.User;
import shop.mtcoding.blog.model.user.UserJPARepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class FileService {
    private final FileJPARepository fileJPARepo;
    private final HttpSession session;
    private final UserJPARepository userJPARepo;
    private final EntityManager em;

    @Transactional
    public void upload(FileInfoRequest.UploadDTO reqDTO){
        //1. 데이터전달
        String title = reqDTO.getTitle();
        MultipartFile imgFile = reqDTO.getImgFile();

        //2. 파일저장 위치 설정 및 파일저장 (UUID)
        String imgFilename = UUID.randomUUID()+"_"+imgFile.getOriginalFilename();
        Path imgPath = Paths.get("./upload/"+imgFilename);
        try {
            // 이미지 파일 저장
            Files.write(imgPath, imgFile.getBytes());

            // 3. DB에 저장 (title, realFileName)

            //  fileInfoRepository.insert(title, imgFilename);

            // User imgFileName update

            User sessionUser = (User) session.getAttribute("sessionUser");
            User newSessionUser = userJPARepo.findById(sessionUser.getId())
                    .orElseThrow(() -> new Exception401("로그인이 필요한 서비스입니다."));

            newSessionUser.setImgFileName(imgFilename);

            session.setAttribute("sessionUser",newSessionUser);
            // user db 에 저장
//            User newComp  = userRepository.updateImgFileName(imgFilename, comp.getId());
            // session 저장
//            session.setAttribute("sessionUser",newComp);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
